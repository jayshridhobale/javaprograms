package ExceptionHandling;

public class Exception5 {
    public static void main(String[] args) {
        try {
            test("jayu");
            info(50, 0);
        } catch (NullPointerException | ArithmeticException n) {
            System.out.println(n);
        }
        System.out.println("Main method ended");
    }
    static void test(String s){
        System.out.println("test Started");
        System.out.println("Length"+s.length());
        System.out.println("Test ended");
    }
    static void info(int a,int b){
        System.out.println("Info started");
        int result=a/b;
        System.out.println(result);
        System.out.println("info ended");
    }

}
