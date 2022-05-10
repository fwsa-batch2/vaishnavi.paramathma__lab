package collections.list;

import java.util.List;
import java.util.Vector;

public class PracticeVector {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("pine apple");
        fruits.add("Grapes");
        fruits.add("kiwi");
        fruits.add("strawberry");
        fruits.add("banana");
        System.out.println(fruits);
        System.out.println("cloned" + fruits.clone());
        System.out.println("size " + fruits.size());

        List<String> subList = fruits.subList(1, 4);
        System.out.println("sublist  " + subList);

        // for (String sub:fruits);
        // System.out.println("subtype "+fruits);

        fruits.forEach(n -> System.out.println(n));
        fruits.removeElement("orange");
        System.out.println(fruits);
        
        fruits.removeElementAt(1);
        System.out.println(fruits);

        fruits.trimToSize();
        System.out.println("trim to size"+fruits);


    }
}
