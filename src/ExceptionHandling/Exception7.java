package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
public class Exception7 {
    public static void main(String[] args) {
        System.out.println("Program started");
        String str="java is object oriented language";
        FileWriter fw=null;
       try{
           fw=new FileWriter("D://Exceptionjava//demo.txt");
           fw.write(str);
           fw.close();
           System.out.println("file creatd successfully");
       } catch (IOException e) {
           System.out.println(e);
       }
        System.out.println("Program ended");
    }
}
