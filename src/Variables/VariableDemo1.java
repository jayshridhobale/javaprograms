package Variables;

 class Demo1 {
    static int k = 25;  //class variable
    double j;     //instance variable

    void test() {
        boolean b = true;  //local variable-non static
        System.out.println("b value is:" + b);
    }
}
public class VariableDemo1{
    public static void main(String[] args) {
        System.out.println("k valuse is:"+Demo1.k);

        Demo1 d1=new Demo1();
        System.out.println("J value is:"+d1.j);
        d1.test();

    
    }
}
