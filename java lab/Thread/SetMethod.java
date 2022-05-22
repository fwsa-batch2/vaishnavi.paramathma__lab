package Thread;

public class SetMethod extends Thread{
    public void run(){
        System.out.println("run this function");
    }

    public static void main(String[] args)  {
        SetMethod obj =new SetMethod();
        obj.start();
        System.out.println("name of obj"+obj.getName());
         obj.setName("vaishnavi");
        System.out.println("after changing name  "+obj.getName());
    }
}
