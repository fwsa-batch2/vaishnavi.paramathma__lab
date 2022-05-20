package javaIO;
import java.io.*;
public class GetpathFile {
    public static void main(String[] args) {
        File a=new File("//home//vaishnaviparamathma//home22-html//homepage.html");
        String getpath = a.getAbsolutePath();
        System.out.println(getpath);
        System.out.println(a.getPath());
    }
}
