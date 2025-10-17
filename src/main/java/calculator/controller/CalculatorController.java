package calculator.controller;

import calculator.model.Calculator;
import calculator.model.CustomParticles;
import calculator.model.Number;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final OutputView outputView;
    private final InputView inputView;

    public CalculatorController() {
        this.outputView = new OutputView();
        this.inputView = new InputView();
    }
    public void run() {
        String value = inputView.input();
        Calculator calculator = new Calculator(value);
        outputView.output(calculator.calculator());
    }
}
