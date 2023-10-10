import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStrListToUpper {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "india");
        String str = countries.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(str);

    }

}
