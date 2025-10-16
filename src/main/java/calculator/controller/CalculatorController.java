package calculator.controller;

import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    // model과 view를 연결시키는 controller 함수
    public void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        String value = inputView.input();
    }
}
