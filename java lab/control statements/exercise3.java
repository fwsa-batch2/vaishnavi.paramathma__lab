// if else statement  
 
import java.util.Scanner;

 public class exercise3{

public static void main(String[] args){

     Scanner abc = new Scanner(System.in);
    //  char a;
     System.out.println("enter the number");
     char charInScanner = abc.next().charAt(0); 
     System.out.println(charInScanner);

     if (charInScanner == 'v'){
       System.out.println("good hearted person's name starts with letter v ");
   }
   else{
       System.out.println("nice letter");
   }
}

}