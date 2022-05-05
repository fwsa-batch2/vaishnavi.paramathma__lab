import java.util.Scanner;

public class AdvanceCalculator {
    
    public static void main(String[] args){
        AdvanceCalculator obj = new AdvanceCalculator();
       Scanner Scannertonumber = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 =  Scannertonumber.nextInt();

        System.out.println("enter your second value");
        int num2 = Scannertonumber.nextInt();

       
        System.out.println(add(num1,num2));
        System.out.println(sub(num1,num2));
        System.out.println(mul(num1,num2));
        System.out.println(div(num1,num2));
        
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }
    public static int mul(int num1, int num2){
        return num1*num2;
    }
    public static int div(int num1, int num2){
        return num1/num2;
    }
} 
