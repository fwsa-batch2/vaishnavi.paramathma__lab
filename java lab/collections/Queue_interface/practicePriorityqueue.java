package collections.Queue_interface;
import java.util.*;
public class practicePriorityqueue {
    public static void main(String[] args) {
       PriorityQueue<Integer> pqueue =new PriorityQueue<>();
       pqueue.add(88);
       pqueue.add(22);
       pqueue.add(33);
       pqueue.add(77);
       pqueue.add(55);
       pqueue.add(44);
       pqueue.add(66);
       System.out.println("added elements in pqueue is"+pqueue);
       System.out.println("offer  "+pqueue.offer(22));
       System.out.println("element at first   "+ pqueue.element());
       System.out.println("peek at first   "+ pqueue.peek() );
       System.out.println("poll the element  "+ pqueue.poll());
       System.out.println("added elements in pqueue is"+pqueue);
       System.out.println("remove  "+ pqueue.remove());
       System.out.println("added elements in pqueue is  "+pqueue);


    }
}
