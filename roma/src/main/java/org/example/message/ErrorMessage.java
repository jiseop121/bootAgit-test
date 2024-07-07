package org.example.message;

public enum ErrorMessage {
    INVALID_ROMAN_NUMERAL("잘못된 로마 숫자 표기입니다."),
    OUT_OF_RANGE("표현할 수 없는 범위의 수입니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
