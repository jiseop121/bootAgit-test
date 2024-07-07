package org.example.system;


import org.example.IO.Input;
import org.example.IO.Output;
import org.example.calculator.RomaNumberDecoder;
import org.example.dto.ResultDto;
import org.example.dto.RomaDto;

public class RomaDecoderSystem {

    public RomaDecoderSystem() {
    }

    public void run() {
        try {
            RomaDto romaDto = Input.InputRoma();
            int romanToInt = RomaNumberDecoder.romanToInt(romaDto);
            Output.displayResult(new ResultDto(romaDto.getRomanNumeral(), romanToInt));
        } catch (IllegalArgumentException e) {
            Output.displayError(e);
        }
    }
}
