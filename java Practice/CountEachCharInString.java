import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharInString {
    public static void main(String[] args) {
        String str = "helloo";
        // char[] ch = str.toCharArray();
        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(map);
    }

}
