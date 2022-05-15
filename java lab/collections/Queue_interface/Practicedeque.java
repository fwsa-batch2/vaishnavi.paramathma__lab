package collections.Queue_interface;
import java.util.*;
public class Practicedeque {
    public static void main(String[] args) {
        Deque<String> deque =new LinkedList<>();
          deque.add("dog");
          deque.add("cat");
          deque.add("parrot");
          deque.addFirst("cow");
          deque.addLast("goat");
     
          System.out.println(deque);
          boolean check = deque.contains("hen");
          if(check== true){
              System.out.println("the element present in the container");
          }
          else{
              System.out.println("th element not present in the container");
          }

          Iterator iterator= deque.descendingIterator();
          while(iterator.hasNext()){
              System.out.println(iterator.next());
          }

          System.out.println("Get first element  :"+deque.getFirst());
          System.out.println("get last element  :"+deque.getLast());
         // "offer last" System.out.println("offer first element   :"+ deque.offerFirst("vaish"));
    }
}
