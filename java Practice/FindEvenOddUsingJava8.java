import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenOddUsingJava8 {

    public static void main(String[] args) {

        // Apporach 1

        // List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // List<Integer> evenNo = nums.stream().filter(n -> n % 2 ==
        // 0).collect(Collectors.toList());
        // List<Integer> oddNo = nums.stream().filter(n -> n % 2 ==
        // 1).collect(Collectors.toList());
        // System.out.println("Even no is : " + evenNo);
        // System.out.println("Odd no is :=" + oddNo);

        /// Apporach 2
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Map<Boolean, List<Integer>> resultMap = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNo = resultMap.get(true);
        List<Integer> oddNo = resultMap.get(false);

        System.out.println("Even no is : " + evenNo);
        System.out.println("Odd no is : " + oddNo);

    }

}
