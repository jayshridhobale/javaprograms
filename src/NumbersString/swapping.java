package NumbersString;

public class swapping {
    public static void main(String[] args) {
        int a=14;
        int b=24;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
