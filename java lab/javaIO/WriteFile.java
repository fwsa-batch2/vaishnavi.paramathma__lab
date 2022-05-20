package javaIO;
import java.io.*;
public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter filewrite =new FileWriter("//home//vaishnaviparamathma//home22-html//homepage.html");
        filewrite.write("Originally, this programming was named Oak. However, another language already existed by that name and therefore it was renamed Java. ");
        filewrite.write("cyrus was born on august 2021");
        filewrite.close();
        System.out.println("hii team");

    }
}
