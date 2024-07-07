package org.example.IO;

import org.example.dto.ResultDto;

public class Output {

    public static void displayResult(ResultDto resultDto) {
        System.out.println("로마 숫자 " + resultDto.getRomanNumeral() + "의 정수 값은 " +
            resultDto.getNumber() + "입니다.");
    }
    public static void displayError(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
}
