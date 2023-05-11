package FileHandling;

import java.io.File;

public class FileOperation {
    public static void main(String[] args) {
        File f3=new File("demo.txt");
        if(f3.exists()){
            System.out.println("File Name is : "+f3.getName());
            System.out.println("File Path is : "+f3.getPath());
            System.out.println("File Actual Path is : "+f3.getAbsolutePath());
            System.out.println("File Size is : "+f3.length());
            System.out.println("File is Readable or not : "+f3.canRead());
            System.out.println("File is Writable or not : "+f3.canWrite());
            System.out.println("File length is : "+f3.length());
        }
        else {
            System.out.println("file is not Present");
        }
    }
}
