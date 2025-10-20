package calculator;

import calculator.view.ApplicationInput;
import calculator.view.ApplicationOutput;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationInput input = new ApplicationInput();
        ApplicationOutput output = new ApplicationOutput();
        Splitter splitter = new Splitter();
        Calculator calculator = new Calculator();

        output.printStart();
        String inputString = input.inputString();

        Delimit delimit = new Delimit(inputString);
        String numberInput = delimit.getNumberInput(inputString);

        List<String> numbers = splitter.splitString(numberInput, delimit.getDelimiter());

        output.printResult(calculator.calculate(numbers));
    }
}
