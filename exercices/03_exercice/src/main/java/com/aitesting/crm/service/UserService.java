package com.aitesting.crm.service;

import com.aitesting.crm.domain.User;
import com.aitesting.crm.enums.RoleEnum;
import com.aitesting.crm.exception.NotAllowedException;
import com.aitesting.crm.exception.PhoneNumberExistsException;
import com.aitesting.crm.exception.UserInvalidInfoException;
import com.aitesting.crm.repository.UserRepository;

public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public String getUserName(Long id) {
    User user = userRepository.findById(id);
    return user != null ? user.name() : "User not found";
  }

  public void createNewUser(User user) {
    if (user.name() == null || user.phoneNumber() == null || user.role() == null) {
      throw new UserInvalidInfoException("User information is missing");
    }

    User userWithPhoneNumber = userRepository.findByPhoneNumber(user.phoneNumber());
    if (userWithPhoneNumber != null) {
      throw new PhoneNumberExistsException("This phone number is already in use");
    }
    userRepository.save(user);
  }

  public void deleteUser(Long id) {
    // TODO :: Implement this method
    // If the user does not exist, then do nothing
    // If the user exists but has the admin role, then throw a NotAllowedException
  }

}
