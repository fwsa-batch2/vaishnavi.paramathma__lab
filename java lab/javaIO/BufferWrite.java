package javaIO;
import java.io.*;
public class BufferWrite {
    public static void main(String[] args) throws Exception {
        FileWriter file = new FileWriter("/home/vaishnaviparamathma/home22-html//table.html");
        BufferedWriter bufferwrite = new BufferedWriter(file);
        bufferwrite.append("hi currently i am learning java io");
        bufferwrite.close();
        System.out.println("hi team");
    }
}





