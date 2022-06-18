import static java.lang.System.out;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
    // String a ="meenu";
    // out.println(Remove.duplicates("meenu"));

// Scanner abc = new Scanner(System.in);
//    long ab = abc.nextLong();
//    if( ab.indexOf(0) == 7 || 8|| 9 ){
//        System.out.println(ab);
//    }
//    else{
//        System.out.println("your number not accepted");
//    }
    
    //     Scanner sc = new Scanner(System.in);
    //     String  name[] = sc.nextLine().split(" ");
    //   String ans="";
    // //   System.out.println(name);
    //   for (int i = name.length-1; i>=0; i--) {
    //     //   System.out.println(name.charAt(i));
    //     ans += (name[i]+" ");
    //   }
    //   System.out.println(ans);

   
    Scanner sc = new Scanner(System.in); // takes input
    System.out.println("Enter number of rows: ");
    int rows = sc.nextInt();
    for (int i= rows; i>= 1; i--)
    {
    for (int j=rows; j>i;j--)
    {
    System.out.print(" ");
    }
    for (int k=1;k<=i;k++)
    {
    System.out.print("*");
    }
    System.out.println("");
    }
    sc.close();
    }
    }
     
    
//Scanner sc = new Scanner (System.in);
//String name[] =sc.nextLine().split(" ");
//String ans ="";
// for (int i=name.length-1; i>=0; i--){
   // ans +=(name[i]+" "); 
//}
// sout(ans)