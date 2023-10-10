import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);
        Stream<Integer> fullList = Stream.concat(list1.stream(), list2.stream());
        List<Integer> allElement = fullList.collect(Collectors.toList());
        Set<Integer> uniqueElement = allElement.stream().collect(Collectors.toSet());
        Integer min = uniqueElement.stream().min((x1, x2) -> x1 - x2).get();
        System.out.println("mini value is =" + min);
        Integer max = uniqueElement.stream().max((x1, x2) -> x1 - x2).get();
        System.out.println("mini value is =" + max);
    }

}
