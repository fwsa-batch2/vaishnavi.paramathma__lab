public class BasicCalculator{

      public static void main(String[] args){
        
         System.out.println("addition"+ add(5,10));
         System.out.println("addition"+ add(12,23));
         System.out.println("subraction "+sub(12,10));

         System.out.println("multiply"+mul(5,10));
      
         System.out.println("division"+div(20,10));
      }
      public static int add(int a,int b){
       return a+b;
      }
      public static float sub(int a,int b){
        return a-b;
      }
      public static float mul(int a,int b){
        return a*b;
      }
      public static float div(int a,int b){
        return a/b;
      }



}