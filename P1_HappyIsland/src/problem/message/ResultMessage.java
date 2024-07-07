package problem.message;

public enum ResultMessage {
    OUT_OF_RANGE("국왕께서 문의 주신 숫자로 행복한 수를 판별할 수 없습니다.\n 숫자의 범위는 1이상 1,000,000 이하입니다."),
    UNHAPPY_NUMBER("0"),
    HAPPY_NUMBER("1");

    ResultMessage(String message) {
    }
}
