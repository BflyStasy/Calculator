package Gift;

import java.util.Scanner;

/**
 * Course: Java for Testers 2.0
 *
 * @author Kulagina Anastasi
 */
public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a task:\n" + "1 - Array.\n" + "2 - Gifts.");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                arrayChangeMinMax();
                break;
            case 2:
                createGift();
                break;
            default:
                System.out.printf("Entered an invalid value: %d", i);
        }
        scanner.close();
    }

    public static void arrayChangeMinMax() {

        double arr[] = new double[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = Math.random() * 21 - 10;
        }
        double min = 10.0;
        double max = -10.0;
        int indexMin = 0, indexMax = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            } else if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        arr[indexMin] = max;
        arr[indexMax] = min;

        System.out.printf("Reversed array elements: %d, %d\n", indexMin, indexMax);
        System.out.printf("The values of these elements: %.4f, %.4f\n", arr[indexMin], arr[indexMax]);
        System.out.print("Array: ");
        for (int i = 0; i < 20; i++)
            System.out.printf("%.4f  ", arr[i]);


    }

    public static void createGift() {
        Sweet Candy = new Sweet("Candy", 0.58, 23.5, 1);
        Sweet Jellybean = new Sweet("Jellybean", 1.45, 45.7, 8);
        Sweet MM = new Sweet("M&M", 2.47, 60.0, 17);
        Sweet[] sweets = new Sweet[]{Candy, Jellybean, MM};

        Gift myGift = new Gift();
        myGift.addSweetsToGift(sweets);
        myGift.printInformationAboutGift();
    }

}
