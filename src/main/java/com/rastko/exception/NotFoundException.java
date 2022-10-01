package com.rastko.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends CustomException {

  public NotFoundException(String msg) {
    super(msg, HttpStatus.NOT_FOUND, ErrorCode.RESOURCE_NOT_FOUND);
  }

}
