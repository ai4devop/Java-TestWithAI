package com.aitesting.crm.exception;

public class UserInvalidInfoException extends RuntimeException {
  public UserInvalidInfoException(String errorMessage) {
    super(errorMessage);
  }
}