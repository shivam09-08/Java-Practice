public class RemoveChar {
    public static void main(String[] args) {
        String str = "cloudtech";
        char ch = 't';
        removechar(str, ch);
    }

    public static void removechar(String str, char c) {
        String finalStr = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != c) {
                finalStr = finalStr + str.charAt(i);
            }
        }
        System.out.println("The final string after remove " + c + "  is =" + finalStr);

    }

}
