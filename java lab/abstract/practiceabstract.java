abstract class aa {
    abstract void cat();
}
class bb extends aa{
    void cat(){
        System.out.println("Hello you are cat");
    }
}
class cc extends aa{
    void cat(){
        System.out.println("Your name is tom ");
    }
}
class practiceabstract{
    public static void main(String[] args) {
        bb obj=new bb();
        // cc myobj=new cc();
        obj.cat();
       // myobj.cat();
    }
}
