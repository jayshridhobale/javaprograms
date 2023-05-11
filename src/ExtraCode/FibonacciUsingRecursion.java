package ExtraCode;

public class FibonacciUsingRecursion {
    static int a=0,b=1,c;

    public static void main(String[] args) {
        FibonacciUsingRecursion fibo=new FibonacciUsingRecursion();
        System.out.println(a+"\t\t"+b);
        fibo.printFibo(10);
    }
        void printFibo(int num){
                if(num>=1){
                    c=a+b;
                    System.out.println(c);
                    a=b;
                    b=c;
                    printFibo(num-1);
                }

        }
}
