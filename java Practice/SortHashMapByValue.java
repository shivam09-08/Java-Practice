import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 1);
        map.put("c", 4);
        map.put("d", 3);
        System.out.println("Before Sorting");
        System.out.println(map);
        LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream().sorted((e1, e2) -> {
            return e1.getValue() - e2.getValue();
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("After Sorting");
        System.out.println(sortedMap);
    }

}
