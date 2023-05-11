package Casting;

public class CastingDemo1 {
    public static void main(String[] args) {
        //matching info
        int x=10;
        double y=32.10;

        System.out.println("X is:"+x);
        System.out.println("Y value is:"+y);

        //non_matching info
        //narrowing
        int p=(int)35.25;


        //widening
        double d=20;

        System.out.println("P Value is:"+p);
        System.out.println("D value is:"+d);

    }
}
