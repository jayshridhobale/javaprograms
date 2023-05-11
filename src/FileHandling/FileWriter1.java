package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String[] args) throws IOException {
        File f1=new File("file.txt");
        FileWriter fw=new FileWriter(f1,true);
        fw.write("This is a core java class ");
        fw.close();
    }
}
