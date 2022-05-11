package collections.Map_interface;
import java.util.*;

public class Practicetreemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> Games= new TreeMap<>();

        Games.put(1,"Football");
        Games.put(2,"cricket");
        Games.put(3,"fencing");
        Games.put(4,"hand ball");
        Games.put(5,"fooseball");
        Games.put(6,"volley ball");
        System.out.println(Games);

        System.out.println("ceiling value"+Games.ceilingEntry(5));
        System.out.println("ceiling value"+Games.ceilingEntry(7));



        

    }
}
