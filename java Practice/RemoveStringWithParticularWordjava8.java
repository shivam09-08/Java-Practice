import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveStringWithParticularWordjava8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "date", "cherry", "ananas");
        String stringTORemove = "an";
        List<String> filterWords = words.stream().filter(n -> !n.contains(stringTORemove)).collect(Collectors.toList());
        System.out.println(filterWords);
    }
}
