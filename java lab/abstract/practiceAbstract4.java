abstract class pencil{
    abstract String characters();
}
class apsara extends pencil{
    String characters(){return "nice brand";}
}
class natraj extends pencil{
    String characters(){return "last long pencil";}
}
public class practiceAbstract4 {
    public static void main(String[] args) {
       apsara obj=new apsara();
       System.out.println(obj.characters());
       natraj myobj=new natraj(); 
       System.out.println(myobj.characters());
    }
}
