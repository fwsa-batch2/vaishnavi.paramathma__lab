package collections.list;

import java.util.Scanner;

public class HasNext {
    public static void main(String args[]){           
            String s = " hello";  
          //Create scanner Object and pass string in it  
          Scanner scan = new Scanner(s);  
          //Check if the scanner has a token  
          System.out.println("Result: " + scan.hasNext());  
          //Print the string  
          System.out.println("String: " +scan.nextLine());  
          //Check if the scanner has a token after printing the line  
          System.out.println("Final Result: " + scan.hasNext());  
          //Close the scanner  
          scan.close();  
        }    

}
