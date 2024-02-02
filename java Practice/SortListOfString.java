import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("banana", "apple", "papaya", "cherry");
        List<String> sortedString = str.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedString);
    }

}
