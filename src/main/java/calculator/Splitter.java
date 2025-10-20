package calculator;

import java.util.List;

public class Splitter {

    public List<String> splitString(String input, String delimiter) {
        return List.of(input.split(delimiter));
    }
}
