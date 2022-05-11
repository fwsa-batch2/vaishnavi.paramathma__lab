package collections.Map_interface;

import java.util.HashMap;
public class PracticeHashmap {
   public static void main(String[] args) {
       HashMap<Integer,String> entries= new HashMap<>();

       entries.put(1,"vaishnavi");
       entries.put(2,"vaishu");
       entries.put(3,"vaishu kutty");
       entries.put(4,"vp");
       System.out.println(entries);
      
       entries.replace(3,"vaishali");
       System.out.println(entries);

       int size = entries.size();
       System.out.println(size);

       entries.entrySet();
       System.out.println(entries);

       System.out.println(entries.size());

       System.out.println(entries.containsValue("vp"));

       System.out.println(entries.containsKey(3));
       } 
}
