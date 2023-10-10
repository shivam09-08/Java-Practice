public class SwapTwoNoWthoutThird {

    public static void main(String[] args) {
        int a = 40;
        int b = 30;
        System.out.println("First no . before swap is = " + a);
        System.out.println("Second no before swap is = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First no  after swap is = " + a);
        System.out.println("Second no after swap is = " + b);
    }
}
