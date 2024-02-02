import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNum {
    public static void main(String[] args) {
        int numbs[] = { 5, 9, 11, 2, 8, 21, 1 };
        Integer secondHig = Arrays.stream(numbs).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHig);
    }
}
