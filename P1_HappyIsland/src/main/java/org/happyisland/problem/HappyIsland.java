package org.happyisland.problem;


import org.happyisland.problem.IO.Input;
import org.happyisland.problem.IO.Output;
import org.happyisland.problem.calculator.HappyNumberChecker;
import org.happyisland.problem.calculator.HappyNumberCheckerV1;
import org.happyisland.problem.message.ResultMessage;

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
            System.out.println(ResultMessage.OUT_OF_RANGE.getMessage());
            return;
        }

        Output.displayResult(happyNumberChecker.isHappy(n));
    }

    private boolean isOutOfRangeNumber(int n){ // 제한수 체크
        return MINIMUM > n || n > MAXIMUM;
    }
}