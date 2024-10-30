package com.aitesting.crm.exception;

public class PhoneNumberExistsException extends RuntimeException {
  public PhoneNumberExistsException(String errorMessage) {
    super(errorMessage);
  }
}