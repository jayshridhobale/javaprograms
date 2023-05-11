package NumbersString;

public class swappingTwoNoUsingBitwise {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("before swapping");
        System.out.println("a "+a+"\t"+"b "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
