import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindTheFirstCharStartWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Appple", "Blueberry", "Grapes", "Banana");

        Optional<String> result = names.stream().filter(name -> name.startsWith("B")).findFirst();

        System.out.println(result);
    }

}
