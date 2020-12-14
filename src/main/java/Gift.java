import java.util.Scanner;

public class Gift {
    private int amountSweets;
    private Sweet[] sweets;

    public Gift(){
        //setAmountSweets();
        setSweets();
    }

    public void setSweets() {
        String name;
        double weight;
        double price;
        int rating;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of sweets in the gift:");
        this.amountSweets = scanner.nextInt();

        sweets = new Sweet[amountSweets];
        for (int i = 0; i < amountSweets; i++) {
            System.out.println((i + 1) + " Enter the name of the sweet:");
            name = scanner.next();

            System.out.println((i + 1) + " Enter the weight of the sweet:");
            weight = scanner.nextDouble();

            System.out.println((i + 1) + " Enter the price of the sweet:");
            price = scanner.nextDouble();

            System.out.println((i + 1) + " Enter the rating of the sweet:");
            rating = scanner.nextInt();

            sweets[i] = new Sweet(name, weight, price, rating);
        }
        scanner.close();
    }

    public double getWeightGift() {
        double weightGift = 0.0;
        for (int i = 0; i < amountSweets; i++) {
            weightGift += sweets[i].getSweetWeight();
        }
        return weightGift;
    }

    public double getPriceGift() {
        double priceGift = 0.0;
        for (int i = 0; i < amountSweets; i++) {
            priceGift += sweets[i].getSweetPrice();
        }
        return priceGift;
    }

    public void printInformationAboutGift() {
        System.out.printf("\nGift weight: %.2f\n", this.getWeightGift());
        System.out.printf("Gift cost: %.2f\n", this.getPriceGift());
        System.out.println("The gift includes:");
        for (int i = 0; i < amountSweets; i++) {
            System.out.printf("%s, %d\n", sweets[i].getSweetName(), sweets[i].getSweetRating());
        }

    }
}
