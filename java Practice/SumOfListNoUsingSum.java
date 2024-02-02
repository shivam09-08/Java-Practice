import java.util.Arrays;
import java.util.List;

public class SumOfListNoUsingSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int sum = numbers.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sum);
    }

}
