public class StringJoiner {
    public static void main(String[] args) {
        java.util.StringJoiner sj1 = new java.util.StringJoiner(",", "[", "]");
        sj1.add("A").add("B").add("C");
        System.out.println(sj1);
        java.util.StringJoiner sj2 = new java.util.StringJoiner(":");
        sj2.add("p").add("q");
        System.out.println(sj2);
        sj1.merge(sj2);
        System.out.println(sj1);
    }

}
