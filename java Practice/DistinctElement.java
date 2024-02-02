import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElement {
    public static void main(String[] args) {
        List<Integer> elem = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 5);
        List<Integer> disList = elem.stream().distinct().collect(Collectors.toList());
        System.out.println(disList);
    }

}
