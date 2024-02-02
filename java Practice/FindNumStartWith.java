import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumStartWith {
    public static void main(String[] args) {
        int[] elements = { 5, 9, 11, 2, 8, 21, 1 };
        List<String> startwith = Arrays.stream(elements).boxed().map(s -> s + "").filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());

        System.out.println(startwith);
    }
}
