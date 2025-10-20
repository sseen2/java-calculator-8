package calculator;

public class Application {
    public static void main(String[] args) {
        View view = new View();
        Splitter splitter = new Splitter();
        Calculator calculator = new Calculator();

        view.printStart();
        String input = view.inputString();

        Delimit delimit = new Delimit(input);
        String numberInput = delimit.getNumberInput(input);

        String[] numbers = splitter.splitString(numberInput, delimit.getDelimiter());

        view.printResult(calculator.calculate(numbers));
    }
}
