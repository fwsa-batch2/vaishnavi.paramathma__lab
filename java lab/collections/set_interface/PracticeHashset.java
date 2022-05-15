package collections.set_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PracticeHashset {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(7);
        hs.add(5);
        hs.add(3);
        hs.add(9);
        hs.add(9);
        System.out.println(hs);
        
        HashSet set = new HashSet<>();
         set = (HashSet)hs.clone(); 
         System.out.println(set);

         System.out.println("check the value contain or not  :"+ hs.contains(3));

         Boolean chk = hs.isEmpty();
         if(chk == true){
             System.out.println("the list is empty");
         }
         else{
             System.out.println("the list contains element");
         }
       
       Iterator abc= hs.iterator();
       while(abc.hasNext()){
           System.out.println(abc.next());
       } 

    }
}
