package org.example.validation;

import org.example.message.ErrorMessage;

public class Validator {
    public static void validateLength(String alienString) throws IllegalArgumentException {
        if (alienString == null || alienString.isEmpty() || alienString.length() > 1000) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }

    public static void validateCharacters(String alienString) throws IllegalArgumentException {
        if (!alienString.matches("[a-z]+")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }
}
