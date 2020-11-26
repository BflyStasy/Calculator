import java.util.Scanner;

/**
 * Course: Java for Testers 2.0
 * @author Kulagina Anastasi
 * @see #calc()
 * @see #arrWords()
 */


public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете задание:\n" + "1 - Запустить калькулятор.\n" + "2 - Поиск максимального слова.");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                calc();
                break;
            case 2:
                arrWords();
                break;
            default:
                System.out.printf("Введено некорректное значение: %d", i);
        }
        scanner.close();
    }

    public static void calc(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double first = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double second = scanner.nextDouble();

        System.out.println("Введите символ операции: '+', '-', '*', '/':");
        String operation = scanner.next();
        scanner.close();
        switch (operation){
            case "+":
                System.out.printf("Результат сложения: %.4f", first + second);
                break;
            case "-":
                System.out.printf("Результат вычитания: %.4f", first - second);
                break;
            case "*":
                System.out.printf("Результат умножения: %.4f", first * second);
                break;
            case "/":
                if(second != 0)
                    System.out.printf("Результат деления: %.4f", first / second);
                else
                    System.out.printf("Делить н аноль нельзя: %.4f/ %.4f", first, second);
                break;
            default:
                System.out.printf("Вы ввели некорректный символ операции - %s", operation);
        }

    }

    public static void arrWords()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        String arr[] = new String[size];
        System.out.printf("Введите %d слов.\n", size);
        int lengthWord = 0;
        int number = 0;
        for(int i = 0; i < size; i++){
            arr[i]=scanner.next();
            if(arr[i].length()>lengthWord){
                lengthWord = arr[i].length();
                number = i;
            }
        }
        System.out.printf("Самое длинное слово в массиве: %s", arr[number]);
        scanner.close();

    }
}
