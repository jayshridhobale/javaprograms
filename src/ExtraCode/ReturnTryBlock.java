package ExtraCode;

public class ReturnTryBlock {
    public static void main(String[] args) {
        int result=divide(10,0);

    }
    public  static  int divide(int a,int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block executed");
        }return 0;
    }

}
