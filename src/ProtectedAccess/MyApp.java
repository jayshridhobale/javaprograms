package ProtectedAccess;

import AccessModifier.Demo;

public class MyApp extends Demo {
    public static void main(String[] args) {
        MyApp m1=new MyApp();
        System.out.println("P value is :"+m1.p);
        System.out.println("A value is :"+m1.a);
    }
}
