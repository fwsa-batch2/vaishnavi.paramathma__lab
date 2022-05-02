abstract class fwsa{
    abstract void students();
}
class freshworks extends fwsa{
    void students(){
        System.out.println("students will become employee soon");
    }
}

public class practiceAbstract2 {
    public static void main(String[] args) {
        freshworks obj=new freshworks();
        obj.students();
    }
}
