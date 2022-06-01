package Thread;
import java.lang.*;
public class JoinMethod extends Thread {
    public void run(){
        for( int i=1; i<6; i++){
            System.out.println(i+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethod obj =new JoinMethod();
        for(int i=1; i<4; i++){
            Thread thr =new Thread(obj);
            thr.start();
            thr.join();
        }

    }
}
