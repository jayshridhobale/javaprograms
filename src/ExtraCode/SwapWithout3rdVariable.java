package ExtraCode;
public class SwapWithout3rdVariable{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("A value is "+a);
        System.out.println("B value is "+b);

    }
}
