package Thread;
import java.lang.*;
public class SleepMethod extends Thread {
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println(i+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }
    public static void main(String[] args) {
        SleepMethod obj=new SleepMethod();
        Thread t=new Thread(obj);
        t.start();
        SleepMethod myobj = new SleepMethod();
        Thread T =new Thread(myobj);
        T.start();
    }
}
