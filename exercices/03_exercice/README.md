# 📝 Exercise 3 - Unit Testing + Mocking ~ 20 minutes

## 🎯 Objectives
In this exercise, you will work with a small customer account management application, _crm_. This application is a simplified proof of concept with limited functionality.

In the `UserService` class, two methods are already implemented: user search and user creation. The goal of this exercise is to explore unit testing using JUnit and Mockito to simulate unmanaged parts of the application.

🔍 **Note**: This application uses neither a framework nor a database, so you will need to _"mock"_ the unmanaged components in your tests.

## 🛠️ Instructions

### 1. Implement Unit Tests in `UserServiceTest`

- In `UserServiceTest`, a setup is already present to write unit tests for various functions in `UserService`.
- You will find test skeletons with a description of what is expected.
- Use these guidelines and Continue to write the necessary unit tests.
- Remember to mock calls to `userRepository`.
- Run the tests and ensure they pass successfully.

### 2. Add the `deleteUser` Feature in `UserService`

- We want to add a `void deleteUser(Long id)` method that follows these rules:
  - If no user is associated with this ID, no action should be taken.
  - If the user exists and has the Admin role, the operation should fail, throwing a `NotAllowedException` with the message _"You cannot delete an admin user"_.
  - The `deleteUser(id)` method in `UserRepository` as well as the exception already exist.
  - Once this method is implemented, write unit tests in `UserServiceTest` to cover these cases.

### 🚀 How to Run the Tests
Run Maven in the terminal to execute the tests:

```bash
mvn clean test
```

## ✅ Validation Criteria:
- The written unit tests pass successfully.
- Tests cover the various rules, including the check for phone number uniqueness.

### 💡 Mockito Tips:
Use this cheatsheet to help mock certain common behaviors:

```java
// Mock a return for a search by ID
when(userRepository.findById(1L)).thenReturn(new User(...));

// Verify if a function is called a certain number of times
verify(userRepository, times(n)).findById(1L);

// Verify that the function is never called
verify(userRepository, never()).deleteUser(1L);

// Check the value of an input argument
verify(userRepository).save(argThat(user -> user.getName().equals("John")));

// Verify that two objects are equal
assertEquals(expected, actual);

// Capture an expected exception
assertThrows(ExpectedException.class, () -> {
    // Code that should trigger an exception
});

