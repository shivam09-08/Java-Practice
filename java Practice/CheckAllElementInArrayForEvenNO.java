import java.util.Arrays;
import java.util.List;

public class CheckAllElementInArrayForEvenNO {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50, 60);
        boolean result = nums.stream().allMatch(n -> n % 2 == 0);
        if (result) {
            System.out.println("All element in array are even");
        } else {
            System.out.println("All element in  array are not  even");

        }
    }

}
