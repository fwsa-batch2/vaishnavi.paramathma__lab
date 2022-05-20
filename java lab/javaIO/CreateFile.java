package javaIO;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)  throws IOException {

            File file = new File("//home//vaishnaviparamathma//home22-html//ioexercise.txt");
            if (file.createNewFile()) {
                System.out.println("sucessfully created");
            } else {
                System.out.println("file not created");
            }


    }
}
