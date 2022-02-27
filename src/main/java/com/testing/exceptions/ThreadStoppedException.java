package com.testing.exceptions;

public class ThreadStoppedException extends RuntimeException {
    public ThreadStoppedException(String message, Throwable cause) {
        super(message, cause);
    }
}
