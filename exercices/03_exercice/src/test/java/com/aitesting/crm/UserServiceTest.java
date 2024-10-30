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
    // TODO :: test to write
    // Behavior if the user does not exist when calling userService.getUserName
  }

  @Test
  public void testCreateNewUser_ValidUser() {
    // TODO :: test to write
    // Behavior if the user is valid when calling userService.createNewUser
  }

  @Test
  public void testCreateNewUser_MissingInfo() {
    // TODO :: test to write
    // Behavior if the user information is incomplete when calling userService.createNewUser
  }

  @Test
  public void testCreateNewUser_PhoneNumberExists() {
    // TODO :: test to write
    // Behavior if a user already exists with the same phone number when calling userService.createNewUser
  }

  @Test
  public void testDeleteUser_UserDoesNotExist() {
    // TODO :: test to write
    // Behavior if the user does not exist when calling userService.deleteUser
  }

  @Test
  public void testDeleteUser_AdminUser() {
    // TODO :: test to write
    // Behavior if the user is an Admin when calling userService.deleteUser
  }

  @Test
  public void testDeleteUser_RegularUser() {
    // TODO :: test to write
    // Behavior if the user has the User role when calling userService.deleteUser
  }

}
