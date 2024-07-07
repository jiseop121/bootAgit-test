package org.happyisland.problem.IO;

import static org.assertj.core.api.Assertions.assertThat;

import org.happyisland.problem.message.ResultMessage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OutputTest {

    @BeforeEach
    public void setUp() {
        TestUtils.setUpOutputCapture();
    }

    @AfterEach
    public void tearDown() {
        TestUtils.restoreOriginalOutput();
    }

    @Test
    public void 행복한_수_정상출력() {
        Output.displayResult(true);
        assertThat(TestUtils.getOutput()).isEqualTo(ResultMessage.HAPPY_NUMBER.getMessage());
        TestUtils.resetOutputCapture();
    }

    @Test
    public void 행복한_수가_아닌_수_정상출력() {
        Output.displayResult(false);
        assertThat(TestUtils.getOutput()).isEqualTo(ResultMessage.UNHAPPY_NUMBER.getMessage());
        TestUtils.resetOutputCapture();
    }
}