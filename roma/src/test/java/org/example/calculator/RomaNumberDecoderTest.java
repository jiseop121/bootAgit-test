package org.example.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.example.dto.RomaDto;
import org.example.message.ErrorMessage;
import org.junit.jupiter.api.Test;

class RomaNumberDecoderTest {

    @Test
    public void 정상_로마숫자() {
        RomaDto romaDto = new RomaDto("MCMXCIV");
        int result = RomaNumberDecoder.romanToInt(romaDto);
        assertThat(result).isEqualTo(1994);
    }

    @Test
    public void 로마숫자_범위초과() {
        RomaDto romaDto = new RomaDto("MMMM");
        assertThatThrownBy(() -> RomaNumberDecoder.romanToInt(romaDto))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(ErrorMessage.OUT_OF_RANGE.getMessage());
    }

    @Test
    public void 로마숫자_형식에러() {
        RomaDto romaDto = new RomaDto("II1");
        assertThatThrownBy(() -> RomaNumberDecoder.romanToInt(romaDto))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(ErrorMessage.INVALID_ROMAN_NUMERAL.getMessage());
    }
}