interface animal{
    void character();
}  
class lion implements animal{
    public void character(){
        System.out.println("lion is the king of the forest");
    }
}
public class practiceInterface {
    public static void main(String[] args) {
        lion obj= new lion();
        obj.character();
    }
}
