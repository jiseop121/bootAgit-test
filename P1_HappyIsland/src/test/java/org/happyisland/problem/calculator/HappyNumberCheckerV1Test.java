package org.happyisland.problem.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HappyNumberCheckerV1Test {

    private final HappyNumberCheckerV1 happyNumberCheckerV1 = new HappyNumberCheckerV1();
    @Test
    void 결과_1의_경우() {
        int[] happyNumbers = {19, 7, 1, 10, 100, 130, 97, 123456};
        for(int num : happyNumbers) {
            assertThat(happyNumberCheckerV1.isHappy(num)).isTrue();
        }
    }

    @Test
    void 반복되는_사이클의_경우(){
        int[] unhappyNumbersWithCycle = {4, 20, 2, 3, 11, 22, 58};
        for (int num : unhappyNumbersWithCycle) {
            System.out.println("cycle : "+num);
            assertThat(happyNumberCheckerV1.isHappy(num)).isFalse();
        }
    }

    @Test
    void 결과_0의_경우(){
        int[] unhappyNumbersWithoutCycle = {999999, 888888};
        for (int num : unhappyNumbersWithoutCycle) {
            System.out.println(num);
            assertThat(happyNumberCheckerV1.isHappy(num)).isFalse();
        }
    }
}