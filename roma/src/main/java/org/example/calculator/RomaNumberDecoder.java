package org.example.calculator;

import java.util.HashMap;
import java.util.Map;
import org.example.dto.RomaDto;
import org.example.validation.DecoderValidator;

public class RomaNumberDecoder {

    private static final Map<Character, Integer> romanToIntegerMap = new HashMap<>();

    static {
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);
    }

    public static int romanToInt(RomaDto romaDto) {
        String romanNumeral = romaDto.getRomanNumeral();

        DecoderValidator.isValidRomanNumeral(romanNumeral);

        int total = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanToIntegerMap.get(romanNumeral.charAt(i));
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        DecoderValidator.isOverMaxValue(total);

        return total;
    }
}
