package org.happyisland.problem.message;

/**
 * 국왕에게 보여줄 출력 메세지 ENUM
 */
public enum ResultMessage {
    UNHAPPY_NUMBER("0"),
    HAPPY_NUMBER("1");

    private final String message;
    ResultMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
