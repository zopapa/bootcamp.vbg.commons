package com.bootcamp.commons.exceptions;

/**
 * Created by darextossa on 11/21/17.
 */
public class DatabaseException extends Exception {

    private StackTraceElement[] stackTraceElements;

    public DatabaseException() {
    }

    public DatabaseException(String message) {
        super(message);
    }

    public DatabaseException(String message, StackTraceElement[] stackTraceElements) {
        super(message);
        this.stackTraceElements = stackTraceElements;
    }

    public DatabaseException(StackTraceElement[] stackTraceElements) {
        this.stackTraceElements = stackTraceElements;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage() + " ";
        if (stackTraceElements != null || stackTraceElements.length != 0) {
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                message = message + stackTraceElement.toString() + " ";
            }
        }

        return message;
    }
}
