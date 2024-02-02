import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordFromList {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Hello", " ", "World", "!");
        String result = string.stream().collect(Collectors.joining());
        System.out.println("Concatenated String is = " + result);
    }

}
