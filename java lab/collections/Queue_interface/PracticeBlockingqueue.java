package collections.Queue_interface;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class PracticeBlockingqueue {
    public static void main(String[] args) {
        BlockingQueue<String> blockqueue =new ArrayBlockingQueue<>(1);
        blockqueue.add("vaishu");
       // blockqueue.add("vaishnavi");
    }
}
