package Calculator;

public class Split extends Operation {


    public Split(double first, double second) {
        super(first, second);
    }

    public boolean divisionByZero() {
        if (this.getSecond() == 0.0)
            return false;
        else
            return true;
    }

    public void calculateResult() {
        if (divisionByZero())
            this.setResult(this.getFirst() / this.getSecond());
    }

    public String showResult() {
        String resultline;
        if (divisionByZero())
            resultline = "The result of the operation: " + this.getResult();
        else
            resultline = "You cannot divide by zero: " + getFirst() + " / " + getSecond();
        return resultline;
    }
}
