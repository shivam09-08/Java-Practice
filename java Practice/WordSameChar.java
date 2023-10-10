import java.util.Arrays;
import java.util.List;

public class WordSameChar {
    public static void main(String[] args) {

        List<String> word = Arrays.asList("ab", "aba", "xyx", "mno", "xyz", "pop");
        word.stream().filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0))))
                .forEach(System.out::println);
    }

}
