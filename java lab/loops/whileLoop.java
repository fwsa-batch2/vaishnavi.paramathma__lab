import java.util.Scanner;
public class whileLoop{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your limit : ");
        int n = in.nextInt();
        int i = 0;
        while (i<=n){
           System.out.println(i);
           i++;
        }
}
}
