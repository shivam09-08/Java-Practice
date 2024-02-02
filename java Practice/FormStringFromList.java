import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FormStringFromList {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple", "banana", "date", "cherry", "grapes");
        String singleStr = str.stream().collect(Collectors.joining(","));
        System.out.println(singleStr);
    }
}
