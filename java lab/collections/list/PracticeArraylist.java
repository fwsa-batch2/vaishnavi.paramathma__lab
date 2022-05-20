package collections.list;

import java.util.*;

public class PracticeArraylist {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
      
        a.add("Komodo dragon");
        a.add("Black mamba");
        a.add("Cottonmouth viper");
        a.add("Gila monster");
        a.add(" American alligator");
        a.add("Leatherback sea turtle");
        System.out.println(a);
        for(String str:a)
        System.out.println(str);

        ArrayList<String> b = new ArrayList<>();
        b.add("cats");
        b.add("dogs");
        b.add(" deer");
        b.add("monkeys");
        b.add("humans");
        b.add("bats");
        b.add("dolphins");
        System.out.println(b);
        for(String arr:b)
        System.out.println(arr);

        a.addAll(b);
        for (String number:a)
        System.out.println(number);

        ArrayList c= (ArrayList) a.clone(); 
        System.out.println(c);

        c.addAll(a);
        System.out.println(a);

        //b.removeIf(n -> (n.charAt(0)=='d'));
        b.removeIf(n -> (n.charAt(0)=='d'));

    //    Arrays.sort(b,comp);
    System.out.println("Reversed B : ");
    Collections.reverse(b);

    
       for (String num : b) {
           System.out.println(num);
       }

       b.forEach(n-> System.out.println(n));

       b.replaceAll(e -> e.toLowerCase());
       b.forEach(n -> System.out.println(n));

       ListIterator<String> iter= b.listIterator();
       System.out.println("after using list iterator");
       if(iter.hasNext()){
           System.out.println("value is "+ iter.next());
       }
       else {
           System.out.println("exception thrown");
       }

       




  
    }
   

}