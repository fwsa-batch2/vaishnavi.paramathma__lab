import java.util.Scanner;

public class primenumber {
   // class variable static int c = 10;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean prime=false;
        int n=scan.nextInt();

        if(n<=0 || n==1){
            System.out.println("the number not prime or composite");
        }
        else{
           for( int i=2; i<n; i++){
              if(n%i==0){
                 prime=true;
                 break;
               }
           }
           if(prime){
               System.out.println("not a prime");
           }
           else{
               System.out.println("prime ");
           }
        }
    }
}
