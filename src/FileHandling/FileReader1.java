package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("file.txt");
        Scanner s1=new Scanner(f1);
        while(s1.hasNextLine()){
            String data=s1.next();
            System.out.println(data);
        }

    }
}
