package org.example.dto;

public class ResultDto {
    private final String romanNumeral;
    private final int number;

    public ResultDto(String romanNumeral, int number) {
        this.romanNumeral = romanNumeral;
        this.number = number;
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }

    public int getNumber() {
        return number;
    }
}
