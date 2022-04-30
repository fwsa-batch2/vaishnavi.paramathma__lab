package polymorphism;

class abc{
    void test(){
        System.out.println("no values");
    }
    void test(int a){
        System.out.println("a is"+a);
    }
    void test(String a,int b){
        System.out.println(a+"is"+b);
    }
}


public class practiceOverloading {
     public static void main(String[] args) {
         abc obj=new abc();
         obj.test();
         obj.test(12);
         obj.test("the value of a",33);

     }   
}
