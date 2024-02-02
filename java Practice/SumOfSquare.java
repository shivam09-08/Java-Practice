import java.util.Arrays;
import java.util.List;

public class SumOfSquare {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 6, 8, 9, 12);

        int SumOfSquareNO = num.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();
        System.out.println(SumOfSquareNO);
    }
}
