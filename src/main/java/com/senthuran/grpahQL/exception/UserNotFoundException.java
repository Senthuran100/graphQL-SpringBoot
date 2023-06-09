package com.senthuran.grpahQL.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(int id) {
        super(String.format("User with Id %d not found", id));
    }
}
