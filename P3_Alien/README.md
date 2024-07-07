# 3. 외계어 사전 만들기
## 문제 접근 방법:
1. 중복 문자 제거: 문자열 내의 각 문자에 대해 중복 여부를 확인하여, 한 번만 등장하는 문자들을 추출합니다.
2. 사전순 정렬: 중복이 제거된 문자들 중에서 사전순으로 가장 앞서는 문자를 찾습니다.
3. 인덱스 확인: 찾은 문자가 원본 문자열에서 처음으로 등장하는 위치를 찾습니다.
4. 출력 형식: 결과를 "문자 (인덱스: 위치)" 형식으로 출력합니다. 
5. 만약 모든 문자가 중복되어 제거된 후 남은 문자가 없다면, 특정 메시지를 출력합니다.
## 코드 분석[main]
| 마지막 문제는 시간에 쫓겨 제대로 생각하고 해결하진 못했다... 양해바랍니다..!
### AlienLanguageAnalyzerSystem

```java
package org.example.calcluator;

import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
      System.out.println(result);
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


```
* String의 indexOf()메서드 사용
  * indexOf는 항상 첫번째로 등장하는 Character의 인덱스를 반환하기 때문에
  * 중복이든 아니든 문제의 추가 조건에 성립한다.
* HashSet 사용
  * HashSet을 통해서 중복제거를 한다
  * 해쉬 함수를 통한 중복 검사를 통해 Set을 완성시키기 때문에
  * 중복 검사에 대한 시간 소모가 적다
* ArrayList 사용
  * Set만으로는 정렬의 기능을 구현할 수 없다.
  * ArrayList로 변환하여 Collections.sort를 통해 다시 정렬한다.
  