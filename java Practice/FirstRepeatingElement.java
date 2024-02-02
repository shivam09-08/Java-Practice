import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 3, 6 };
        printFirstRepeating(arr);

    }

    static void printFirstRepeating(int arr[]) {
        int min = -1;
        int n = arr.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <= n - 1; i++) {
            if (set.contains(arr[i])) {
                min = i;
                break;
            } else {
                set.add(arr[i]);
            }
        }
        if (min != -1) {
            System.out.println("Repeating element is =" + arr[min]);
        } else {
            System.out.println("No repeating element found");
        }
    }
}
