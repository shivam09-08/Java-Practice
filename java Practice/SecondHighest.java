import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(25);
        numbers.add(18);
        numbers.add(7);

        Integer secondHighest = findSecondHighest(numbers);
        if (secondHighest != null) {
            System.out.println("second highest element :" + secondHighest);

        } else {
            System.out.println("No second highest element found");
        }
    }

    /**
     * @param numbers
     * @return
     */
    public static Integer findSecondHighest(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            return null;
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        return numbers.get(1);

    }
}
