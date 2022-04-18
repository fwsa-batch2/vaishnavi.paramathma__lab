public class exercise3{
    public static void main(String[] args){
        // logical and operator
         
         int a=5,b =20, c=20,d=0;

         if((a<b)&& (b==c)){
             d=a+b+c;
             System.out.println("sum is"+d);
         }
         else{
             System.out.println("false condition");
         } 

         //logical not operator
         int n1=10, n2=8;
       System.out.println("!(a<b)" +!(a<b));
        System.out.println("!(a<b)" +!(a>b));


          //logical or operator
          if(a<b || b == c){
        System.out.println("the conditions are true");
          }
          else{
           System.out.println("the conditions are false");   
          }
          
    }
}