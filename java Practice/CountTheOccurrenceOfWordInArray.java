import java.util.Arrays;
import java.util.List;

public class CountTheOccurrenceOfWordInArray {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "apple");

        long count = words.stream().filter(word -> word.equals("apple")).count();
        System.out.println("occurrence of apple are :" + count);

    }

}
