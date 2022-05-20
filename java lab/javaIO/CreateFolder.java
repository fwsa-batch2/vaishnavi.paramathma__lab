package javaIO;
import java.io.*;

public class CreateFolder {
    public static void main(String[] args) throws IOException {
        File folder =new File("//home//vaishnaviparamathma//practiceIo");
        if(folder.mkdirs()){
            System.out.println("folder is created ");
        }
        else{
            System.out.println("folder not created");
        }
    }
}
