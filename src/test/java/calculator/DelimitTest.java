package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DelimitTest {

    @Test
    @DisplayName("기본 구분자가 성공적으로 초기화")
    void delimitTest() {
        String input = "1,2:3";
        Delimit delimit = new Delimit(input);
        String expected = ",|:";

        String delimiter = delimit.getDelimiter();

        assertThat(expected).isEqualTo(delimiter);
    }

    @Test
    @DisplayName("커스텀 구분자를 포함한 구분자가 성공적으로 초기화")
    void customDelimitTest() {
        String input = "//!\\n1,2!3:4";
        Delimit delimit = new Delimit(input);
        String expected = ",|:|!";

        String delimiter = delimit.getDelimiter();

        assertThat(expected).isEqualTo(delimiter);
    }

    @Test
    @DisplayName("커스텀 구분자가 앞에 있는 경우 숫자 문자열까지 잘라서 반환")
    void getNumberInputTest() {
        String input = "//!\\n1!2,3";
        Delimit delimit = new Delimit(input);
        String expected = "1!2,3";

        String result = delimit.getNumberInput(input);
        assertThat(result).isEqualTo(expected);
    }
}
