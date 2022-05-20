import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int age =scan.nextInt();
        if(age/2 == 0){
             System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
