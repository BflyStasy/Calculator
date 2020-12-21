import java.util.Scanner;

/**
 * Course: Java for Testers 2.0
 *
 * @author Kulagina Anastasi
 * @see #calc()
 * @see #arrWords()
 */


public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a task:\n" + "1 - Launch Calculator.\n" + "2 - Search for a word of maximum length.");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                calc();
                break;
            case 2:
                arrWords();
                break;
            default:
                System.out.printf("Entered an invalid value: %d", i);
        }
        scanner.close();
    }

    public static void calc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double first = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double second = scanner.nextDouble();

        System.out.println("Enter the operation symbol: '+', '-', '*', '/':");
        String operation = scanner.next();
        scanner.close();
        switch (operation) {
            case "+":
                System.out.printf("Addition result: %.4f", first + second);
                break;
            case "-":
                System.out.printf("Subtraction result: %.4f", first - second);
                break;
            case "*":
                System.out.printf("The result of the multiplication: %.4f", first * second);
                break;
            case "/":
                if (second != 0)
                    System.out.printf("Division result: %.4f", first / second);
                else
                    System.out.printf("You cannot divide by zero: %.4f/ %.4f", first, second);
                break;
            default:
                System.out.printf("You entered an invalid operation symbol - %s", operation);
        }

    }

    public static void arrWords() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        String arr[] = new String[size];

        System.out.printf("Enter %d words.\n", size);
        int lengthWord = 0;
        int number = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
            if (arr[i].length() > lengthWord) {
                lengthWord = arr[i].length();
                number = i;
            }
        }
        System.out.printf("\nLongest word in an array: %s\n", arr[number]);
        scanner.close();

    }
}
