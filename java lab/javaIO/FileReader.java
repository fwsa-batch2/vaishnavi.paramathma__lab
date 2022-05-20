package javaIO;
import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {
        File readfile = new File("//home//vaishnaviparamathma//home22-html//homepage.html");
        Scanner scan =new Scanner(readfile);
        while(scan.hasNextLine()){
            String fileread = scan.nextLine();
            System.out.println(fileread);
        }

    }
}
