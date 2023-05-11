package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter file name");
        String file=s1.next();
        File f1=new File("E:\\HTML\\File",file);
        try{
            boolean create=f1.createNewFile();
            if(create){
                System.out.println("File is create");
            }
            else {
                System.out.println("File is not created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
