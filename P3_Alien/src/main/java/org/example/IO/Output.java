package org.example.IO;

public class Output {
    public static void displayResult(String result) {
        System.out.println(result);
    }

    public static void displayError(Exception e){
        System.out.println(e.getMessage());
    }
}
