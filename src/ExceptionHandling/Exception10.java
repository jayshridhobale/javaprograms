package ExceptionHandling;


public class Exception10 {

static void test(){
    System.out.println("Test started");
    int c=5/0;
    System.out.println(c);
    System.out.println("Test ended");
}
static void display()
{
    System.out.println("Display started");
    try{
        test();
    }catch (ArithmeticException e){
        System.out.println(e);
    }
}
    public static void main(String[] args) {
        System.out.println("Main started");
        display();
        System.out.println("MAin ended");
    }
}
