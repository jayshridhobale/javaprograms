package WrapperClass;

//Wrapper-class:- using autoboxing and auto-unboxing
public class WrapperDemo1 {
    public static void main(String[] args) {
        int a=10; //primitive info
        Integer b= new Integer(20);  //non-primitive info
        System.out.println(b);
        System.out.println(a);
        int p=50;
        Integer q=p; //autoboxing
        int d=q; //auto-unboxing
        System.out.println(p);
        System.out.println(q);
        System.out.println(d);
    }
}
