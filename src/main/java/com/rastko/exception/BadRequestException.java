package com.rastko.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CustomException {

  public BadRequestException(String msg) {
    super(msg, HttpStatus.BAD_REQUEST, ErrorCode.BAD_REQUEST);
  }

}
