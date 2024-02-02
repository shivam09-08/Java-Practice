import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseOfJoinMethod {
    public static void main(String[] args) {
        List<String> numbres = Arrays.asList("1", "2", "3", "4", "5");
        // String joint = String.join("-", numbres);
        String joint = numbres.stream().collect(Collectors.joining(","));
        System.out.println(joint);
    }
}
