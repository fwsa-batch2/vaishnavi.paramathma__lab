package collections.set_interface;
import java.util.*;
public class PracticeLinkedhashset {
   public static void main(String[] args) {
     LinkedHashSet<String> lhm =new LinkedHashSet<>();
       lhm.add("Dhoni");
       lhm.add("tendulkar");
       lhm.add("virat");
       lhm.add("dinesh karthik");
       lhm.add("polard");
       System.out.println(lhm);

       LinkedHashSet get_clone =new LinkedHashSet<>();
       get_clone = (LinkedHashSet) lhm.clone();
       System.out.println(get_clone);
       
       Iterator itr = lhm.iterator();
       while(itr.hasNext()){
         System.out.println(itr.next());
       }


   } 
}
