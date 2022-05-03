interface drawing{
    void painting();
}
class pencildraw implements drawing{
    public void painting(){
        System.out.println("using pencil");
    }
}
class oilpaint implements drawing{
    public void painting(){
        System.out.println("i love oil painting");
    }
}
public class practiceInterface2 {
    public static void main(String[] args) {
        oilpaint obj=new oilpaint();
        obj.painting();
    }
}
