import java.util.Arrays;

public class LongestStringFromArray {
    public static void main(String[] args) {
        String[] words = { "java", "python", "springboot", "microservicesusingboot" };

        String longestWord = Arrays.stream(words).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(longestWord);
    }
}
