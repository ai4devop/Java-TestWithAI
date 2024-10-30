package com.aitesting.crm.exception;

public class NotAllowedException extends RuntimeException {
  public NotAllowedException(String errorMessage) {
    super(errorMessage);
  }
}