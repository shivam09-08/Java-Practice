import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOccurenceOfEachChar {
    public static void main(String[] args) {
        String words = "ilovejavatecie";
        Map<String, Long> count = Arrays.stream(words.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);

    }
}
