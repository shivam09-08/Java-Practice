import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateEleFromString {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        List<String> duplicate = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(n -> n.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicate);
    }
}
