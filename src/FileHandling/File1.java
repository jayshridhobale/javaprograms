package FileHandling;

import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        File f1=new File("File.txt");
        try{
            boolean file1=f1.createNewFile();
            if(file1){
                System.out.println("File is created");
            }
            else{
                System.out.println("File is not created");
            }
        }catch (IOException o){
            System.out.println(o);
        }
    }
}
