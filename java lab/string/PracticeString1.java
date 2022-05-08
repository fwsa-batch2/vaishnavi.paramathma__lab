package string;
public class PracticeString1{
    public static void main(String[] args) {
        String str="vaishnavi paramathma";
        String s1="vaishnavi paramathma";

        int a=str.charAt(1);
        int b=str.charAt(11);

        System.out.println((char)a);
        System.out.println((char)b);

        int c=str.codePointAt(2);
        System.out.println(c);

        int d=str.codePointBefore(3);
        System.out.println(d);
        
        System.out.println(str.compareTo(str));

        System.out.println(str.concat (s1));

        System.out.println(str.contains("para"));
        System.out.println(s1.contains("vaish"));
        System.out.println(s1.contains("abi"));
        
        System.out.println(str.contains(s1));
        

    }
  

}