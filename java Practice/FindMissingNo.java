
public class FindMissingNo {
    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        int sum = (10 * 11) / 2;
        System.out.println(sum);
        int actualSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            actualSum = actualSum + arr1[i];
        }
        System.out.println("Missing no is = " + (sum - actualSum));
    }

}
