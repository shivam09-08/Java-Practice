import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordByLength {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "pear", "grape");
        Map<Integer, List<String>> map = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped Strings by there length are as follows =" + map);

    }
}
