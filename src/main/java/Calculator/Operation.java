package Calculator;
/**
 * Course: Java for Testers 2.0
 *
 * @author Kulagina Anastasi
 */

public abstract class Operation {
    private double result;
    private double first;
    private double second;

    public Operation(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String showResult(){
        String resultline = "The result of the operation: " + this.getResult();
        return resultline;
    }
}
