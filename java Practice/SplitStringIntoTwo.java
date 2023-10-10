public class SplitStringIntoTwo {

    public static void main(String[] args) {
        String str = "This is Goodday We have to utilize it";
        int mid = str.length() / 2;
        String lowerCase = " ";
        String upperCase = " ";
        for (int i = 0; i < str.length(); i++) {
            if (i < mid) {
                lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
            } else {
                upperCase = upperCase + Character.toUpperCase(str.charAt(i));

            }
        }
        System.out.println(lowerCase + upperCase);

    }
}
