// nested if statement

import java.util.*;
import java.lang.*;

public class exercise5{
    public static void main(String[] args){

     Scanner abc = new Scanner(System.in);
     System.out.println(" enter the species name ");
     char charInScanner = abc.next().charAt(0);
     System.out.println(charInScanner);

    if(charInScanner == 'A' || charInScanner == 'a'){
        System.out.println("enter the mammal or reptail");
        char species = abc.next().charAt(0);
        if(species ==  'M'  || species == 'm'){
            System.out.println("the animal is mammal");
        }else if(species == 'R'  || species == 'r'){
            System.out.println("the animal is repatil");
        }

    }else if(charInScanner == 'B' || charInScanner == 'b'){
        System.out.println("the species is bird");
    
    }else{
          System.out.println("the species is plant or animals");
     }

    }
}
