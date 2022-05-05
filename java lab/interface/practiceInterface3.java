interface numbers{
    void oddeven();
    static int multi(int x){return x*x*x*x ;};
}
class wholeNumber implements numbers{
    public void oddeven(){
        System.out.println("0 is the smallest number"); 
    }
}

public class practiceInterface3 {
    public static void main(String[] args) {
       
       wholeNumber obj=new wholeNumber();
       obj.oddeven();
       System.out.println(numbers.multi(2));
    }
}
