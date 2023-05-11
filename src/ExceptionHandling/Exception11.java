package ExceptionHandling;

import java.io.IOException;

public class Exception11 {
    static void display() throws IOException{
        System.out.println("this is a main started");
        throw new IOException();

    }
    public static void main(String[] args) {
        try{
            display();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
