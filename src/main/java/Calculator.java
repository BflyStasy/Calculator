import java.util.Scanner;

/**
 * Course: Java for Testers 2.0
 * @author Kulagina Anastasi
 * @see #sumFractalNumbers()
 */


public class Calculator {
    public static void main(String[] args){
        sumFractalNumbers();
    }

    public static void sumFractalNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first fractional number:");
        double a = scanner.nextDouble();

        System.out.println("Enter second fractional number:");
        double b = scanner.nextDouble();

        System.out.printf("Sum is: %.4f", a + b);
        scanner.close();
    }
}
