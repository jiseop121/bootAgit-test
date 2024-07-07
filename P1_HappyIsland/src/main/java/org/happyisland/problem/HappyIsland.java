package org.happyisland.problem;


import org.happyisland.problem.IO.Input;
import org.happyisland.problem.IO.Output;
import org.happyisland.problem.calculator.HappyNumberChecker;
import org.happyisland.problem.calculator.HappyNumberCheckerV1;
import org.happyisland.problem.dto.KingNumber;
import org.happyisland.problem.message.ResultMessage;

/**
 * 해피 아일랜드 프로그램 실행 로직
 */
public class HappyIsland {
    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 1000000;

    private final HappyNumberChecker happyNumberChecker;

    public HappyIsland() {
        this.happyNumberChecker = new HappyNumberCheckerV1();
    }

    public void run(){
        KingNumber kingNumber = Input.InputKingNumber();

        if(isOutOfRangeNumber(kingNumber.getNumber())){ // 요구하는 숫자가 범위를 넘어가면 해당 프로그램 종료
            System.out.println(ResultMessage.OUT_OF_RANGE.getMessage());
            return;
        }

        Output.displayResult(happyNumberChecker.isHappy(kingNumber.getNumber()));
    }

    private boolean isOutOfRangeNumber(int n){ // 제한수 체크
        return MINIMUM > n || n > MAXIMUM;
    }
}