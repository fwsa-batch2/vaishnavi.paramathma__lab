package polymorphism;

class animal{
    void character(){
        System.out.println("Animals can eat");
    }
}
class dog extends animal{
    void character(){
        System.out.println("dog can also eat");
    }
}
public class practiceOverriding {
     public static void main(String[] args) {
       dog obj = new dog();
        obj.character();
     }
}
