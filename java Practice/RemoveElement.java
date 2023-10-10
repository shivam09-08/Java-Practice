import java.util.Arrays;

public class RemoveElement {
    public static void main(String a[])

    {
        int[] originalArray = { 1, 2, 3, 4, 5, 6 };
        int elementToRemove = 4;
        int[] newArray = remove(originalArray, elementToRemove);
        System.out.println("original Array=" + Arrays.toString(originalArray));
        System.out.println("new Array =" + Arrays.toString(newArray));
    }

    public static int[] remove(int[] array, int element) {
        int[] newarray = new int[array.length - 1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                newarray[index] = array[i];
                index++;
            }

        }
        return newarray;
    }
}
