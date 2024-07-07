package org.example.validation;

import org.example.message.ErrorMessage;

public class DecoderValidator {
    public static void isValidRomanNumeral(String s) {
        // 패턴 기반의 로마 숫자 검증
        String pattern = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        if(!s.matches(pattern)){
            throw new IllegalArgumentException(ErrorMessage.INVALID_ROMAN_NUMERAL.getMessage());
        }
    }

    public static void isOverMaxValue(int resultValue){
        if(resultValue > 3999){
            throw new IllegalArgumentException(ErrorMessage.OUT_OF_RANGE.getMessage());
        }
    }
}
