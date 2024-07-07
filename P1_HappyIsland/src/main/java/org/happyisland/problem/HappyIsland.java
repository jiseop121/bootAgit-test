package org.happyisland.problem;


import org.happyisland.problem.IO.Input;
import org.happyisland.problem.IO.Output;
import org.happyisland.problem.calculator.HappyNumberChecker;
import org.happyisland.problem.calculator.HappyNumberCheckerV1;
import org.happyisland.problem.dto.KingNumber;
import org.happyisland.problem.message.ErrorMessage;

/**
 * 해피 아일랜드 프로그램 실행 로직
 */
public class HappyIsland{

    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 1000000;

    private final HappyNumberChecker happyNumberChecker;

    public HappyIsland() {
        this.happyNumberChecker = new HappyNumberCheckerV1();
    }

    public void run() {
        KingNumber kingNumber = Input.InputKingNumber(); // 입력 받기

        checkOutOfRangeNumber(kingNumber); //범위 체크

        Output.displayResult(happyNumberChecker.isHappy(kingNumber.getNumber())); // 계산 후 결과 출력
    }

    private void checkOutOfRangeNumber(KingNumber kingNumber) {
        if (isOutOfRangeNumber(kingNumber.getNumber())) { // 요구하는 숫자가 범위를 넘어가면 해당 프로그램 종료
            throw new IllegalArgumentException(ErrorMessage.OUT_OF_RANGE.getMessage());
        }
    }

    private boolean isOutOfRangeNumber(int n) { // 제한수 체크
        return MINIMUM > n || n > MAXIMUM;
    }
}