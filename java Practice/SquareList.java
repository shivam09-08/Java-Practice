import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SquareList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 5, 6, 7, 8);
        OptionalDouble opt = integers.stream().mapToInt(x -> x * x).filter(n -> n >= 100).average();
        // System.out.println(("Average is = " + opt.getAsDouble()));
        if (opt.isPresent()) {
            System.out.println("Average is = " + opt.getAsDouble());
        } else
            System.out.println("no qualifiying value");
    }
}
