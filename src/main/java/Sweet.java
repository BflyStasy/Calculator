public class Sweet {
    private String sweetName;
    private double sweetWeight;
    private double sweetPrice;
    private int sweetRating;

    public Sweet(String name,double weight,double price,int rating){
        this.sweetName = name;
        this.sweetWeight = weight;
        this.sweetPrice = price;
        this.sweetRating = rating;
    }

    public String getSweetName(){
        return sweetName;
    }
    public void setSweetName(String name){
        this.sweetName = name;
    }

    public double getSweetWeight(){
        return sweetWeight;
    }
    public void setSweetWeight(double weight){
        this.sweetWeight = weight;
    }

    public double getSweetPrice(){
        return sweetPrice;
    }
    public void setSweetPrice(double price){
        this.sweetPrice = price;
    }

    public int getSweetRating(){
        return sweetRating;
    }
    public void setSweetRating(int rating){
        this.sweetRating = rating;
    }



}
