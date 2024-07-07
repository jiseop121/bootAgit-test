package org.happyisland.problem.IO;

import org.happyisland.problem.message.ResultMessage;

public class Output {

    public static void displayResult(boolean isHappy) {
        if (isHappy) {
            System.out.println(ResultMessage.HAPPY_NUMBER.getMessage());
        } else {
            System.out.println(ResultMessage.UNHAPPY_NUMBER.getMessage());
        }
    }
}
