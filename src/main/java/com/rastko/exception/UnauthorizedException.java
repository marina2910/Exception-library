package com.rastko.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends CustomException {

  public UnauthorizedException(String msg) {
    super(msg, HttpStatus.UNAUTHORIZED, ErrorCode.UNAUTHORIZED);
  }

}
