package com.rastko.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

  private final HttpStatus httpStatus;
  private final ErrorCode errorCode;

  public CustomException(String message, HttpStatus httpStatus, ErrorCode errorCode) {
    super(message);
    this.httpStatus = httpStatus;
    this.errorCode = errorCode;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public ErrorCode getErrorCode() {
    return errorCode;
  }

}
