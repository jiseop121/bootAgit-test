package org.happyisland.problem.message;

public enum ErrorMessage {
    OUT_OF_RANGE("국왕께서 문의 주신 숫자로 행복한 수를 판별할 수 없습니다.\n 숫자의 범위는 1이상 1,000,000 이하입니다.");

    private final String message;
    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
