import java.util.Scanner;

public class if_statement{

    public static void main(String[] args){

       Scanner abc = new Scanner(System.in);
       int a;
       System.out.println("enter value for a:");
       a= abc.nextInt();
       if (a>=17){
           System.out.println("you are not child");
       }
    }
}