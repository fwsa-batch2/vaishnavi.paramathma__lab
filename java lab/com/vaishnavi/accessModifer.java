// Private
package com.vaishnavi;

// class A{
//     private int xyz=34;
//     public static void msg(){
//         System.out.println("ueflf");
//     } 
// }

// public class accessModifer extends A{
//     public static void main(String[] args) {
//         msg();
//     }

// }

class a{
    private String xyz="vaishu";
    public void msg(){
       System.out.println("i am full stack developer " + xyz);
    }
}
public class accessModifer{
    public static void main(String[] args) {
       a obj =new a();
       obj.msg(); 
    }
}

