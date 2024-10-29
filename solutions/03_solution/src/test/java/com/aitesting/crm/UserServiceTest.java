package com.aitesting.crm;

import com.aitesting.crm.domain.User;
import com.aitesting.crm.enums.RoleEnum;
import com.aitesting.crm.exception.NotAllowedException;
import com.aitesting.crm.exception.PhoneNumberExistsException;
import com.aitesting.crm.exception.UserInvalidInfoException;
import com.aitesting.crm.repository.UserRepository;
import com.aitesting.crm.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {

  @Mock
  private UserRepository userRepository;

  @InjectMocks
  private UserService userService;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testGetUserName_UserExists() {
    // Arrange
    Long userId = 1L;
    User user = new User(userId, "John Doe", "0606060606", RoleEnum.USER);
    Mockito.when(userRepository.findById(userId)).thenReturn(user);

    // Act
    String result = userService.getUserName(userId);

    // Assert
    Assertions.assertEquals("John Doe", result);
  }

  @Test
  public void testGetUserName_UserDoesNotExist() {
    // Arrange
    Long userId = 2L;
    Mockito.when(userRepository.findById(userId)).thenReturn(null);

    // Act
    String result = userService.getUserName(userId);

    // Assert
    Assertions.assertEquals("User not found", result);
  }

  @Test
  public void testCreateNewUser_ValidUser() {
    // Arrange
    User newUser = new User(null, "John Doe", "1234567890", RoleEnum.USER);
    Mockito.when(userRepository.findByPhoneNumber(newUser.phoneNumber())).thenReturn(null);

    // Act
    userService.createNewUser(newUser);

    // Assert
    Mockito.verify(userRepository).save(newUser);
  }

  @Test
  public void testCreateNewUser_MissingInfo() {
    // Arrange
    User invalidUser = new User(null, null, null, null);

    // Act & Assert
    UserInvalidInfoException thrown = Assertions.assertThrows(UserInvalidInfoException.class,
            () -> userService.createNewUser(invalidUser));

    Assertions.assertEquals("User information is missing", thrown.getMessage());
  }

  @Test
  public void testCreateNewUser_PhoneNumberExists() {
    // Arrange
    User existingUser = new User(null, "Jane Doe", "1234567890", RoleEnum.USER);

    User newUserWithExistingPhone = new User(null, "John Smith", "1234567890", RoleEnum.USER); // Same phone number
    Mockito.when(userRepository.findByPhoneNumber("1234567890")).thenReturn(existingUser);

    // Act & Assert
    PhoneNumberExistsException thrown = Assertions.assertThrows(PhoneNumberExistsException.class,
            () -> userService.createNewUser(newUserWithExistingPhone));

    Assertions.assertEquals("This phone number is already in use", thrown.getMessage());
  }

  @Test
  public void testDeleteUser_UserDoesNotExist() {
    // Arrange
    Long userId = 1L;
    Mockito.when(userRepository.findById(userId)).thenReturn(null); // User does not exist

    // Act
    userService.deleteUser(userId);

    // Assert
    Mockito.verify(userRepository, Mockito.never()).deleteUser(userId); // Ensure deleteUser is never called
  }

  @Test
  public void testDeleteUser_AdminUser() {
    // Arrange
    Long adminUserId = 2L;
    User adminUser = new User(adminUserId, "Admin User", "admin@example.com", RoleEnum.ADMIN);
    Mockito.when(userRepository.findById(adminUserId)).thenReturn(adminUser); // Return an admin user

    // Act & Assert
    NotAllowedException thrown = Assertions.assertThrows(NotAllowedException.class,
            () -> userService.deleteUser(adminUserId));

    Assertions.assertEquals("You cannot delete an admin user", thrown.getMessage());
    Mockito.verify(userRepository, Mockito.never()).deleteUser(adminUserId); // Ensure deleteUser is never called
  }

  @Test
  public void testDeleteUser_RegularUser() {
    // Arrange
    Long userId = 3L;
    User regularUser = new User(userId, "Regular User", "user@example.com", RoleEnum.USER);
    Mockito.when(userRepository.findById(userId)).thenReturn(regularUser); // Return a regular user

    // Act
    userService.deleteUser(userId);

    // Assert
    Mockito.verify(userRepository).deleteUser(userId); // Ensure deleteUser is called
  }

}
