package org.example.calcluator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.example.IO.Input;
import org.example.IO.Output;
import org.example.message.ErrorMessage;
import org.example.validation.Validator;
public class AlienLanguageAnalyzerSystem {

    public static void run() {
        String alienString = Input.getInput();
        try {
            Validator.validateLength(alienString);
            Validator.validateCharacters(alienString);
            String result = analyzeAlienLanguage(alienString);
            Output.displayResult(result);
        } catch (IllegalArgumentException e) {
            Output.displayError(e);
        }
    }

    public static String analyzeAlienLanguage(String alienString) {
        // 중복 문자 제거 및 순서 유지
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : alienString.toCharArray()) {
            uniqueChars.add(c);
        }

        // 유일한 문자가 없는 경우 처리
        if (uniqueChars.isEmpty()) {
            return ErrorMessage.EMPTY_STRING.getMessage();
        }

        // 리스트로 변환하여 정렬
        List<Character> sortedList = new ArrayList<>(uniqueChars);
        Collections.sort(sortedList);

        // 가장 앞서는 문자 선택
        char smallestChar = sortedList.get(0);
        int index = alienString.indexOf(smallestChar);

        return smallestChar + " (인덱스: " + index + ")";
    }
}

