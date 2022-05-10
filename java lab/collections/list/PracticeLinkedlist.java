package collections.list;

import java.util.*;


public class PracticeLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> num1=new LinkedList<>();
     num1.add(1);
     num1.add(2);
     num1.add(3);
     num1.add(4);
     num1.add(5);
     num1.add(6);
     num1.add(3,7);
     num1.addFirst(0);
     num1.remove(0);
     System.out.println(num1);

     Spliterator<Integer> iter= num1.spliterator();
     System.out.println("print numbers");
     num1.forEach(n -> System.out.println(n));

     int size=num1.size();
     System.out.println("The size"+size);
     Integer List2[]=new Integer[ num1.size()];
     List2=num1.toArray(List2);
     
    }
   
    

}
