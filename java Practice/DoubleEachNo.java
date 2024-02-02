import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleEachNo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 3, 4, 5, 6, 7);

        List<Integer> DoubleNo = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(DoubleNo);
    }
}
