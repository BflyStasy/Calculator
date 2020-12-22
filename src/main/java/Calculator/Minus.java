package Calculator;

public class Minus extends Operation {

    double result;

    public Minus(double first, double second) {
        super(first, second);
    }

    public void calculateResult() {
        this.setResult(this.getFirst() - this.getSecond());
    }
}
