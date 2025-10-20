package calculator;

public class Application {
    public static void main(String[] args) {
        View view = new View();

        view.printStart();
        String input = view.inputString();

        Delimit delimit = new Delimit(input);

        // TODO: 구분자로 구분

        // TODO: 덧셈 결과 출력
        view.printResult(0);
    }
}
