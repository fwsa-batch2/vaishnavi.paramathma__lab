// if else statement

import java.util.Scanner;
public class exercise2{

    public static void main(String[] args){
    Scanner abc = new Scanner(System.in);
    int a;
    a = abc.nextInt();
    System.out.println("enter the value");
   if (a>=18){
       System.out.println("you are not child");
   }
   else{
       System.out.println("you are child");
   }

    }
}