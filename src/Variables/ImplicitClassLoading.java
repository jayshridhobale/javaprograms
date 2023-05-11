package Variables;

public class ImplicitClassLoading {     //Implicit classLoading means its having one class and main method
    static double d = 4.4;
    int k=4;
    public static void main(String[] args) {
        System.out.println("Program started:");
        System.out.println("D value is:"+d);
        ImplicitClassLoading c1=new ImplicitClassLoading();
         c1.display();
        System.out.println("k valuse is:"+c1.k);
       info();
    }
    static void info(){
        System.out.println("info method");
    }
    void display(){
        System.out.println("display method");
    }
}