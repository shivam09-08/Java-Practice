public class SwapTwoStringWithoutTemp {
    public static void main(String[] args) {
        String str1 = "cloud";
        String str2 = "tech";

        System.out.println("First String before swap = " + str1);
        System.out.println("Second String before swap " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());
        System.out.println("First String after swap = " + str1);
        System.out.println("Second String after swap " + str2);
    }
}
