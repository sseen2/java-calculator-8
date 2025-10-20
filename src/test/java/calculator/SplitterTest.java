package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SplitterTest {

    @Test
    @DisplayName("구분자로 문자열을 구분하여 반환")
    void splitString() {
        Splitter splitter = new Splitter();
        String input = "1,2:3";
        String delimiter = ",|:";
        List<String> expected = List.of("1", "2", "3");

        List<String> result = splitter.splitString(input, delimiter);

        assertThat(result).isEqualTo(expected);
    }
}
