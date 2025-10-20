package calculator;

public class Calculator {

    public long calculate(String[] numbers) {
        long result = 0;

        for (String number : numbers) {
            result += parseLong(number);
        }

        return result;
    }

    private long parseLong(String number) {
        try {
            long num = Long.parseLong(number);
            validNumber(num);
            return num;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("구분자 이외의 입력값은 숫자여야 합니다.");
        }
    }

    private void validNumber(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("입력된 숫자의 값은 양수여야 합니다.");
        }
    }
}
