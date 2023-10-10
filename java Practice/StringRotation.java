public class StringRotation {
    public static void main(String[] args) {
        String str1 = "cloudtech";
        String str2 = "techcloud";
        if (str1.length() != str2.length()) {
            System.out.println("String2 is not rotation of string1");
        } else {
            str1 = str1 + str1;
            if (str1.indexOf(str2) != -1) {
                System.out.println("String 2 is rotation of string 1");
            } else {
                System.out.println("String 2 is not Rotation of String 1");
            }
        }
    }

}
