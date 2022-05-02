abstract class car{
   car(){
      System.out.println("i love driving car");
   }
   void run(){
      System.out.println("this is good");
   };
   void changespeed(){
      System.out.println("nice car");
   }
} 
class bmw extends car{
      void run(){
         System.out.println("nice car to buy");
      }
   }
   public class practiceAbstract1{
      public static void main(String[] args) {
         bmw obj=new bmw();
         obj.run();
        
      }
   }
