package Gift;

import java.util.ArrayList;
import java.util.List;

public class Gift {

    private double weightGift;
    private double priceGift;
    private List<Sweet> sweets = new ArrayList<>();

    public void addSweetsToGift(Sweet[] currentSweets) {
        for (Sweet sweet : currentSweets) {
            sweets.add(sweet);
        }
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public void calculateWeightGift() {
        weightGift = 0.0;
        for (Sweet sweet : sweets) {
            weightGift += sweet.getSweetWeight();
        }
    }

    public double getPriceGift() {
        return priceGift;
    }

    public void calculatePriceGift() {
        priceGift = 0.0;
        for (Sweet sweet : sweets) {
            priceGift += sweet.getSweetPrice();
        }
    }

    public double getWeightGift() {
        return weightGift;
    }

    public void printInformationAboutGift() {
        calculateWeightGift();
        calculatePriceGift();
        System.out.printf("\nGift weight: %.2f\n", this.getWeightGift());
        System.out.printf("Gift cost: %.2f\n\n", this.getPriceGift());
        System.out.println("The gift includes:");
        for (Sweet sweet : sweets) {
            System.out.printf("%s, %d\n", sweet.getSweetName(), sweet.getSweetID());
        }
    }
}


