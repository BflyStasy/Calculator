package TaskSix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Course: Java for Testers 2.0
 *
 * @author Kulagina Anastasi
 */
public class TaskSix {
    private static List<String> words = new ArrayList<>();
    private static final List<unicWord> unicwords = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException {
        scanWords();
        Collections.sort(words);

        countWords();
        printInformation();

        int index = findMaxCount();
        System.out.printf("\n\nThe word with the maximum number of repetitions:\n \"%s\" - %d time(s).\n ", unicwords.get(index).getWord(),unicwords.get(index).getCount());
    }

    //функция считывания слов из файла
    public static void scanWords() throws FileNotFoundException {
        FileReader fin = new FileReader("C:\\Users\\User\\IdeaProjects\\Calc\\src\\main\\java\\Test.txt");
        Scanner scanner = new Scanner(fin);

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        scanner.close();
    }

    //функция подсчета сколько раз каждое слово встречается
    public static void countWords() {
        int i;
        for (int j = 0; j < words.size(); j++) {
            for (i = unicwords.size() - 1; i >= 0 && unicwords.get(i).getWord().compareToIgnoreCase(words.get(j)) != 0; i--) {}

                if (i < 0) {
                    unicWord word = new unicWord(words.get(j));
                    unicwords.add(word);
                } else {
                    unicwords.get(i).updateCount();
                }
            }
    }

    //печать информации о том, сколько раз встречается каждое слово
    public static void printInformation(){
        for(unicWord word: unicwords){
            System.out.printf("The word \"%s\" occurs %d time(s).\n", word.getWord(),word.getCount());
        }


    }

    //поиск слова которое встречается максимальное количество раз
    public static int findMaxCount(){
        int index = 0;
        int max = unicwords.get(0).getCount();
        for(int i=1;i<unicwords.size();i++){
            if(unicwords.get(i).getCount()>max){
                max = unicwords.get(i).getCount();
                index = i;
            }
        }
        return index;
    }


}
