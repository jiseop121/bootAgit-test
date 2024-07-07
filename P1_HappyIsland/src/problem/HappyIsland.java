package problem;

import java.util.Scanner;
import problem.IO.Input;
import problem.IO.Output;
import problem.calculator.HappyNumberChecker;
import problem.calculator.HappyNumberCheckerV1;
import problem.message.ResultMessage;

public class HappyIsland {
    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 1000000;

    private final HappyNumberChecker happyNumberChecker;

    public HappyIsland() {
        this.happyNumberChecker = new HappyNumberCheckerV1();
    }

    public void run(){
        int n = Input.InputKingNumber();

        if(isOutOfRangeNumber(n)){
            System.out.println(ResultMessage.OUT_OF_RANGE);
            return;
        }

        Output.displayResult(happyNumberChecker.isHappy(n));
    }

    private boolean isOutOfRangeNumber(int n){ // 제한수 체크
        return MINIMUM > n || n > MAXIMUM;
    }
}

//