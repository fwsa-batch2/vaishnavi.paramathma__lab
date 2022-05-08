package string;

public class PracticeStringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("vaishnavi");

        System.out.println(str.append("paramathma"));
        str.append('p');
        // capacity
        System.out.println(str);
        StringBuilder s1 = new StringBuilder();
        int capacity = s1.capacity();
        System.out.println("default capacity" + capacity);
        s1.append("vaishu");
        capacity = s1.capacity();
        System.out.println("current capacity" + capacity);
        StringBuilder s2 = new StringBuilder("hi i am vaishnavi");
        int capa = s2.capacity();
        System.out.println(s2);
        System.out.println(capa);
        System.out.println(str);
        System.out.println(str.delete(1, 9));
        System.out.println(str.deleteCharAt(3));

        int length = str.length();
        int capac = str.capacity();
        System.out.println(length);
        System.out.println(capac);
        str.trimToSize();
        length = str.length();
        capac = str.capacity();
        System.out.println(length);
        System.out.println(capac);

    }
}
