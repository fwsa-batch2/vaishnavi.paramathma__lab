abstract class world{
    abstract void special();
}
class india extends world{
   void special(){
       System.out.println("india is rich in culture");
   } 
}
class tokyo extends world{
    void special(){
        System.out.println("tokyo is best place to visit");
    }
}

public class practiceAbstract3 {
    public static void main(String[] args) {
        india obj=new india();
        obj.special();
    }
}
