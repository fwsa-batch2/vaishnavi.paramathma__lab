// else -if statement
import java.util.*;
import java.lang.*;

public class exercise4{
    public static void main(String[] args){

      Scanner abc =new Scanner(System.in);
       System.out.println("enter the grade");

       char IntinScanner =  abc.next().charAt(0);
        System.out.println(IntinScanner);

        if(IntinScanner == 'A'){
           System.out.println("nice grade keep it up");
        }
        else if(IntinScanner == 'B'){
            System.out.println("nice grade try to get a grade");
        }
        else if( IntinScanner == 'C'){
            System.out.println("good try");
        }
        else{
            System.out.println("try hard get good grade");
        }

    }
}

