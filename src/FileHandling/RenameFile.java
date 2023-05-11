package FileHandling;

import java.io.File;
import java.io.IOException;

public class RenameFile {
        public static void main(String[] args) throws IOException {
            File f1=new File("file.txt");
            File f2=new File("Text.txt");
            f1.renameTo(f2);
    }
}
