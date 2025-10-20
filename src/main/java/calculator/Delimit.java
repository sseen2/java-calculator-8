package calculator;

public class Delimit {

    private static final String DEFAULT_DELIMITER = ",|:";
    private static final String CUSTOM_DELIMITER_START = "//";
    private static final String CUSTOM_DELIMITER_END = "\\n";

    private final String delimiter;

    public Delimit(String input) {
        this.delimiter = addDelimiter(input);
    }

    private String addDelimiter(String input) {
        String delimiter = DEFAULT_DELIMITER;
        delimiter += customDelimiter(input);
        return delimiter;
    }

    private String customDelimiter(String input) {
        if (input.startsWith(CUSTOM_DELIMITER_START)) {
            int end = input.indexOf(CUSTOM_DELIMITER_END);
            validCustomDelimiterEnd(end);

            return "|" + input.substring(2, end);
        }

        return "";
    }

    private void validCustomDelimiterEnd(int end) {
        if (end == -1) {
            throw new IllegalArgumentException("커스텀 구분자 등록에 실패하였습니다.");
        }
    }

    public String getDelimiter() {
        return delimiter;
    }
}