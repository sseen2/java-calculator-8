package calculator;

import calculator.view.ApplicationInput;
import calculator.view.ApplicationOutput;

public class Application {
    public static void main(String[] args) {
        ApplicationInput inputView = new ApplicationInput();
        ApplicationOutput outputView = new ApplicationOutput();
        Splitter splitter = new Splitter();
        Calculator calculator = new Calculator();

        outputView.printStart();
        String input = inputView.inputString();

        Delimit delimit = new Delimit(input);
        String numberInput = delimit.getNumberInput(input);

        String[] numbers = splitter.splitString(numberInput, delimit.getDelimiter());

        outputView.printResult(calculator.calculate(numbers));
    }
}
