package Calculator;

import java.util.Scanner;

public class TaskFive {
    public static double first;
    public static double second;
    public static String operation;

    public static void main(String[] args) {

        if (ScanNumber() == 0) {
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

    //for for task 7
    public static int ScanNumber()
    {
        Scanner scanner = new Scanner(System.in);
        String number;

        System.out.println("Enter the first number:");
        number = scanner.next();
        try{
            first = Double.parseDouble(number);
        }catch (NumberFormatException e){
            System.out.println("You entered an incorrect value - '" + number + "'" );
            return -1;
        }

        System.out.println("Enter the second number:");
        number = scanner.next();
        try{
            second = Double.parseDouble(number);
        }catch (NumberFormatException e){
            System.out.println("You entered an incorrect value - '" + number + "'" );
            return -2;
        }

        System.out.println("Enter the operation symbol: '+', '-', '*', '/':");
        operation = scanner.next();
        scanner.close();
        return 0;
    }
}
