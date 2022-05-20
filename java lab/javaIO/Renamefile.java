package javaIO;
import java.io.*;
public class Renamefile {
    public static void main(String[] args)  throws IOException{
        File file = new File("//home//vaishnaviparamathma//home22-html//homepage.html");
        File newname =new File("//home//vaishnaviparamathma//home22-html//basic.html");
        boolean renamed = file.renameTo(newname);
        System.out.println(renamed);
    }
}
//    ackage com.javatutorialhq.java.examples;
//
//        import java.io.File;
//
///*
// * This example source code demonstrates the use of
// * renameTo() method of File class.
//public class FileRenameToExample {
//
//    public static void main(String[] args) {
//
//        // initialize File object
//        File origFile = new File("C:javatutorialhqinputtest_file.txt");
//        File destFile = new File("C:javatutorialhqinputtest.txt");
//        // check if file exists
//        if(origFile.exists()){
//            // rename the file
//            boolean result = origFile.renameTo(destFile);
//            // check if the rename operation is success
//            if(result){
//                System.out.println("Operation Success");
//            }else{
//                System.out.println("Operation failed");
//            }
//
//        }else{
//            System.out.println("File does not exist");
//        }
//    }
//}