package Gift;

public class Sweet {
    private String sweetName;
    private double sweetWeight;
    private double sweetPrice;
    private int sweetID;

    public Sweet(String sweetName, double sweetWeight, double sweetPrice, int sweetID) {
        this.sweetName = sweetName;
        this.sweetWeight = sweetWeight;
        this.sweetPrice = sweetPrice;
        this.sweetID = sweetID;
    }

    public String getSweetName() {
        return sweetName;
    }

    public void setSweetName(String sweetName) {
        this.sweetName = sweetName;
    }

    public double getSweetWeight() {
        return sweetWeight;
    }

    public void setSweetWeight(double sweetWeight) {
        this.sweetWeight = sweetWeight;
    }

    public double getSweetPrice() {
        return sweetPrice;
    }

    public void setSweetPrice(double sweetPrice) {
        this.sweetPrice = sweetPrice;
    }

    public int getSweetID() {
        return sweetID;
    }

    public void setSweetID(int sweetID) {
        this.sweetID = sweetID;
    }
}
