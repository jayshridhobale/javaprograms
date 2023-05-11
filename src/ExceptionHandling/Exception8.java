package ExceptionHandling;
//checked --->Compile time Exception
import java.io.FileWriter;
import java.io.IOException;

public class Exception8 {
    public static void main(String[] args) {
        System.out.println("Program started");
        String str="java is object oriented language";
        FileWriter fw=null;
        try{
            fw=new FileWriter("demo.txt"); //when you don't give the path ...the file will create inside the itellijid
            fw.write(str);
            System.out.println("file creatd successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
        finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
                System.out.println("Program ended");
            }
        }
    }
}
