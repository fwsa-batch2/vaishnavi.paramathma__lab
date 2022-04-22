import java.util.Scanner;

public class ForLoops{
  public static void main(String[] args){

    System.out.println("enter your number");
    Scanner no = new Scanner(System.in);
    
    int n = no.nextInt();
    for(int i=1; i<=n; i++){
        System.out.println(i);
    }

  }
}