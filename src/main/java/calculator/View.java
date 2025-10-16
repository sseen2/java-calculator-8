package calculator;

import camp.nextstep.edu.missionutils.Console;

public class View {

    private static final String START_STR = "덧셈할 문자열을 입력해 주세요.";
    private static final String RESULT_STR = "결과 : ";

    public void printStart() {
        System.out.println(START_STR);
    }

    public String inputString() {
        return Console.readLine();
    }

    public void printResult(long result) {
        System.out.println(RESULT_STR + result);
    }
}
