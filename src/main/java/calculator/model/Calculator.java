package calculator.model;

public class Calculator {
    private final String value;
    public Calculator(String value) {
        this.value = value;
    }
    public int calculator() {
        Number number = new Number();
        int [] num = number.separateNum(value);
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        return total;
    }
}
