package TaskSix;

public class unicWord {
    private String word;
    private int count;

    public unicWord(String word) {
        this.word = word;
        this.count = 1;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    public void updateCount(){
        this.count++;
    }

}
