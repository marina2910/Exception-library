package com.rastko.exception;

public record ErrorDetails(String message, String timestamp, ErrorCode errorCode) {
}
