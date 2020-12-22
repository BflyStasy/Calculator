package Calculator;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double first = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double second = scanner.nextDouble();

        System.out.println("Enter the operation symbol: '+', '-', '*', '/':");
        String operation = scanner.next();
        scanner.close();
        Operation result;
        final String s;
        switch (operation) {
            case "+":
                result = new Plus(first, second);
                ((Plus) result).calculateResult();
                s = result.showResult();
                break;
            case "-":
                result = new Minus(first, second);
                ((Minus) result).calculateResult();
                s = result.showResult();
                break;
            case "*":
                result = new Multiply(first, second);
                ((Multiply) result).calculateResult();
                s = result.showResult();
                break;
            case "/":
                result = new Split(first, second);
                ((Split) result).calculateResult();
                s = result.showResult();
                break;
            default:
                s = "You entered an invalid operation symbol - " + operation;
        }
        System.out.println(s);
    }
}
