import java.util.Arrays;

public class MergeTwoSortArray {
    public static void main(String[] args) {
        int arr1[] = { 10, 20, 30, 40, 50 };
        int arr2[] = { 9, 18, 27, 36, 45 };
        int finalArray[] = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, finalArray, 0, arr1.length);
        System.arraycopy(arr2, 0, finalArray, arr1.length, arr2.length);
        Arrays.sort(finalArray);
        for (int elem : finalArray) {
            System.out.print(elem + " ");
        }
    }

}
