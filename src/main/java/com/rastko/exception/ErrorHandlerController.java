package com.rastko.exception;

import com.google.gson.Gson;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;

@ControllerAdvice
public class ErrorHandlerController {

  @ExceptionHandler(CustomException.class)
  @ResponseBody
  public ResponseEntity<?> handleCustomException(CustomException customException) {
    ErrorDetails errorDetails = new ErrorDetails(customException.getMessage(), Instant.now().toString(), customException.getErrorCode());

    Gson gson = new Gson();
    String details = gson.toJson(errorDetails);

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);

    return new ResponseEntity<>(details, headers, customException.getHttpStatus());
  }

}
