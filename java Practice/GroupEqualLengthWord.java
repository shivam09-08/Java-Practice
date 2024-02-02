import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupEqualLengthWord {
    public static void main(String[] args) {
        List<String> equalLength = Arrays.asList("Apple", "Banana", "Cherry", "Date",
                "Grapes");
        Map<Integer, List<String>> mapString = equalLength.stream().collect(Collectors.groupingBy(String::length));

        List<Integer> equalNum = Arrays.asList(1, 2, 3, 3, 5, 6, 6);
        Map<Integer, Long> mapInt = equalNum.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapString);
        System.out.println(mapInt);
    }
}
