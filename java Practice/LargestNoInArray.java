import java.util.Arrays;

public class LargestNoInArray {
    public static void main(String[] args) {
        int arr[] = { 19, 32, 23, 14, 50, 46 };
        int largest = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        // Arrays.sort(arr);
        // largest = arr[arr.length - 1];
        System.out.println("lagest element is =" + largest);
    }

}
