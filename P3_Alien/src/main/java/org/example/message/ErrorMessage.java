package org.example.message;

public enum ErrorMessage {
    EMPTY_STRING("중복 제거 후 빈 문자열이 되었습니다."),
    INVALID_INPUT("잘못된 입력입니다. 외계어 문자열은 1 이상 1,000 이하의 알파벳 소문자로만 이루어져야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}