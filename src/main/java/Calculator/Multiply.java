package Calculator;

public class Multiply extends Operation {

    double result;

    public Multiply(double first, double second) {
        super(first, second);
    }

    public void calculateResult() {
        this.setResult(this.getFirst() * this.getSecond());
    }
}
