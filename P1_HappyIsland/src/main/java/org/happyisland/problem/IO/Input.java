package org.happyisland.problem.IO;

import java.util.Scanner;
import org.happyisland.problem.dto.KingNumber;

public class Input {

    //국왕이 입력한 숫자를 DTO로 반환
    public static KingNumber InputKingNumber(){
        Scanner scanner = new Scanner(System.in);
        return new KingNumber(scanner.nextInt());
    }
}
