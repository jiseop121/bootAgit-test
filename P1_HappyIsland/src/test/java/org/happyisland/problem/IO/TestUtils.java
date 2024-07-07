package org.happyisland.problem.IO;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestUtils {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;


    // 출력 캡처 설정
    public static void setUpOutputCapture() {
        System.setOut(new PrintStream(outContent));
    }

    // 캡처된 출력 가져오기
    public static String getOutput() {
        return outContent.toString().trim();
    }

    // 원래 출력으로 복원
    public static void restoreOriginalOutput() {
        System.setOut(originalOut);
    }

    // 캡처된 출력 초기화
    public static void resetOutputCapture() {
        outContent.reset();
    }
}
