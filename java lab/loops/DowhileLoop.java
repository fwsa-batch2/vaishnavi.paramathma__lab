import java.util.Scanner;

public class DowhileLoop{

public static void main(String[] args){
     
System.out.println("enter your number");
   Scanner abc = new Scanner(System.in);
   int n = abc.nextInt(), i=1;
   do{
       System.out.println(i);
       i++;
   }while(i<=n);

}

}