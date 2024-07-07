package org.example.IO;

import java.util.Scanner;

public class Input {
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("외계어 문자열을 입력하세요: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
