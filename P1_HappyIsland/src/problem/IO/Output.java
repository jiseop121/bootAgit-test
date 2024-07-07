package problem.IO;

import problem.message.ResultMessage;

public class Output {

    public static void displayResult(boolean isHappy) {
        if(isHappy){
            System.out.println(ResultMessage.HAPPY_NUMBER);
        }
        else{
            System.out.println( ResultMessage.UNHAPPY_NUMBER);
        }
    }
}
