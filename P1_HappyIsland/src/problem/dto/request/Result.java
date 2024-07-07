package problem.dto.request;

import problem.message.ResultMessage;

public class Result {
    private final int number;
    private final boolean isHappyNumber;
    private final ResultMessage resultMessage;

    public Result(int number, boolean isHappyNumber, ResultMessage resultMessage) {
        this.number = number;
        this.isHappyNumber = isHappyNumber;
        this.resultMessage = resultMessage;
    }

    public int getNumber() {
        return number;
    }

    public boolean isHappyNumber() {
        return isHappyNumber;
    }

    public ResultMessage getResultMessage() {
        return resultMessage;
    }
}
