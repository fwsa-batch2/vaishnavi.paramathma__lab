package collections.list;

import java.util.*;

public class PracticeList1{
    public static void main(String[] args) {
       List<String> a=new ArrayList<>();
       a.add("vaish");
       a.add("navi");
       a.add("vaishnavi");
       a.set(1,"paramathma");
       a.remove(2);
       System.out.println(a);

       
    }
}