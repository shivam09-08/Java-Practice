import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingEle {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        String firstNonRepeatingEle = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1).findFirst().get().getKey();

        System.out.println(firstNonRepeatingEle);
    }
}
