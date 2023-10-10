import java.util.Arrays;

public class CompareArr {

    public static void main(String[] args) {
        int arr1[] = { 3, 2, 5, 3 };
        int arr2[] = { 2, 3, 8, 5 };
        if (areEqual(arr1, arr2)) {
            System.out.println("two array are equals ");
        } else {
            System.out.println("two array are not equals");
        }
    }

    public static boolean areEqual(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        if (n != m) {
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
