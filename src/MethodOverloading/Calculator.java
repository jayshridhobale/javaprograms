package MethodOverloading;

public class Calculator {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(double a,double b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
