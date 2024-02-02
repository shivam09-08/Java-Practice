public class ReverseNo {
    public static void main(String[] args) {
        // int a = 1234;
        // int reverse = 0;
        // while (a != 0) {
        // int rem = a % 10;
        // reverse = reverse * 10 + rem;
        // a = a / 10;
        // }
        // System.out.println("Reverse number is =" + reverse);

        // 2 Approach
        int a = 12345;
        int reverse;

        StringBuilder str = new StringBuilder(String.valueOf(a));
        reverse = Integer.valueOf(str.reverse().toString());
        System.out.println("Reversed number is : " + reverse);

    }
}
