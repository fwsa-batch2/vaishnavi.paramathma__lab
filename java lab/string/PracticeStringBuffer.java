package string;

public class PracticeStringBuffer {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("hi");
        System.out.println(a);
        System.out.println(a.insert(2,"vaishnavi"));
        System.out.println(a.toString());
        System.out.println(a.substring(0,4));
        a.setCharAt(1,'i' );
        System.out.println(a);
        System.out.println(a.charAt(1));
    }
}
