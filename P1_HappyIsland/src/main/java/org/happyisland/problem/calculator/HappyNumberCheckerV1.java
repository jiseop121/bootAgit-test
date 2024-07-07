package org.happyisland.problem.calculator;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberCheckerV1 implements HappyNumberChecker {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();  // 숫자가 반복되는지 확인하기 위한 집합
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextNumber(n);
//            System.out.println(n);
        }
        return n == 1;  // 1이 되면 true를 반환하고, 사이클이 발생하면 false를 반환
    }

    private static int getNextNumber(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;  // 마지막 자릿수 추출
            totalSum += digit * digit;  // 자릿수의 제곱을 합산
            n /= 10;  // 다음 자릿수로
        }
        return totalSum;
    }
}
