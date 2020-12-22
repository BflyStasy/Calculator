package Calculator;

public class Plus extends Operation {


    public Plus(double first, double second) {
        super(first, second);
    }

    public void calculateResult() {
        this.setResult(this.getFirst() + this.getSecond());
    }

}
