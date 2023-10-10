public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int key = 60;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);

    }

    public static void binarySearch(int arr[], int first, int last, int key) {
        while (first <= last) {

            int mid = (first + last) / 2;
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element found at location = " + mid);
                break;
            } else {
                last = mid - 1;
            }
        }

        if (first > last) {
            System.out.println("Element not found in an array");
        }
    }
}
