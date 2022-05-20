package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.lang.*;

public class PracticeHandling {

    public static void checkAge(int age) throws Exception{
        if(age<=18){
            throw new Exception("you must belo age 18");
        }
        else{
            System.out.println("you are above age 18");
        }
    }
    public static void main(String[] args) throws Exception {

        checkAge(22);
        System.out.println("hi team");
        // arithematic exception
        // try {
        //     int x = 2, y = 0;
        //     int z = x / y;
        //     System.out.println(z);
        // } catch (ArithmeticException e) {
        //     System.out.println("Can't divide a number by 0");
        // }

        // // null pointer exception
        // try {
        //     String str = null;
        //     System.out.println(str.charAt(0));
        // } catch (Exception e) {
        //     System.out.println("cannot get a letter at 0th index");
        // }

        // // StringIndexOutOfBound Exception
        // try {
        //     String a = "i am vaishnavi";
        //     System.out.println(a.charAt(20));
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // //NumberFormat Exception
        // try {
        //     int number = Integer.parseInt("vaihnavi");
        //     System.out.println(number);
        // } catch (Exception e) {
        //     System.out.println("the given database is int but you have entered string");
        // }
         
        // //ArrayIndexOutOfBounds Exception
        // try{
        //     int a[]= new int[5];
        //     a[6] = 5;
        // }
        // catch(Exception e){
        //     System.out.println("capacity is five");
        // }
        // finally{
        //     System.out.println("you have done some examples of exception handling");
        // }




        //file not found error
        try{
        File file =new File("E://home");
        FileReader fir = new FileReader(file);
        }
        catch(Exception e){
        System.out.println("file not found");
        }
        //if else error throw and throws
    }
}
