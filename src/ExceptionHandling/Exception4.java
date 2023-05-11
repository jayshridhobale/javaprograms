package ExceptionHandling;

public class Exception4 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int[] arr=new int[3];
        int a=10;
        int b=0;
        try {
            try {
                arr[4] = 10;
                System.out.println(arr[4]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println(a/b);
        }catch (ArithmeticException c){
            System.out.println(c);
        }
        System.out.println("Program ended");
    }
}
