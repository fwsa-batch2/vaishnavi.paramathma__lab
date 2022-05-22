package Thread;
import java.lang.*;
public class Basics  extends Thread {

    public void run(){
//        Thread.sleep(2000);
//        System.out.println("i am vaishu");
        for(int i =0; i<4; i++){
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i+"from"+Thread.currentThread().getName());
        }

    }
    public static void main(String[] args){
        Basics obj = new Basics();
        obj.start();
    }
}
