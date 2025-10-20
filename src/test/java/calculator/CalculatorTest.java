package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("문자열을 숫자로 바꾼 후 덧셈한 결과를 반환")
    void calculate() {
        Calculator calculator = new Calculator();
        List<String> numbers = List.of("1", "2", "3");
        long expected = 6;

        long result = calculator.calculate(numbers);

        assertThat(expected).isEqualTo(result);
    }
}
