package calculator;

import calculator.view.ApplicationInput;
import calculator.view.ApplicationOutput;

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

        String[] numbers = splitter.splitString(numberInput, delimit.getDelimiter());

        output.printResult(calculator.calculate(numbers));
    }
}
