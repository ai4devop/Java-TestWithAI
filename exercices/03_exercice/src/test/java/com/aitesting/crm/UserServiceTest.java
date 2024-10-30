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
    // TODO :: test à écrire
    // Comportement si l'utilisateur n'existe pas  à l'appel de userService.getUserName
  }

  @Test
  public void testCreateNewUser_ValidUser() {
    // TODO :: test à écrire
    // Comportement si l'utilisateur est valide à l'appel de userService.createNewUser

  }

  @Test
  public void testCreateNewUser_MissingInfo() {
    // TODO :: test à écrire
    // Comportement si l'utilisateur est incomplèt à l'appel de userService.createNewUser

  }

  @Test
  public void testCreateNewUser_PhoneNumberExists() {
    // TODO :: test à écrire
    // Comportement si un utilisateur existe déjà avec le même numéro de téléphone à l'appel de userService.createNewUser
  }

  @Test
  public void testDeleteUser_UserDoesNotExist() {
    // TODO :: test à écrire
    // Comportement si l'utilisateur n'existe pas à l'appel de userService.deleteUser
  }

  @Test
  public void testDeleteUser_AdminUser() {
    // TODO :: test à écrire
    // Comportement si l'utilisateur est Admin à l'appel de userService.deleteUser
  }

  @Test
  public void testDeleteUser_RegularUser() {
    // TODO :: test à écrire
    // Comportement si l'utilisateur a le rôle User à l'appel de userService.deleteUser
  }

}
