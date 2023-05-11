package Casting;

public class CastingDemo2 {
    public static void main(String[] args) {
        char ch='j';
        char ch2='s';

        //widening
        int x1=ch;
        int x2=ch2;

        System.out.println("X1 value is:"+x1);
        System.out.println("X2 value is:"+x2);


        //narrowing

        int x3=90;
        char ch3= (char) x3;
        System.out.println("ch3 Value is:"+ch3);
    }
}
