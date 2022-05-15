package collections.Map_interface;
import java.util.*;
public class PracticeLinkedhashmap {
    private static final int MAX=3;
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> rank=new LinkedHashMap<>(){
            protected boolean removeEldestEntry(Map.Entry<String,Integer> eldest){
                return size()>MAX;
            }
        };
        NavigableMap<Integer, String> treemaphead =new NavigableMap<Integer,String>();
            
        
        rank.put("vaishu",1);
        rank.put("vaishnavi",2);
        rank.put("vp",3);
        System.out.println(rank);


        Set set= rank.entrySet();
        System.out.println("set value"+set);

        int v=rank.getOrDefault("vp",5);
        System.out.println("The default key value is"+v);

        System.out.println(rank.get("vp"));
        rank.put("keerthana",4);
        System.out.println(rank);

        // collections.sort(rank());
        System.out.println(rank);

       // NavigableSet dset = rank.descendingKeySet(); 
       //treemaphead = rank.headMap("vp",true);
    }
   

    
}
