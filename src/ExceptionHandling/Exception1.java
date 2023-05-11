package ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        String str="jayu2219";
        try{
            int no=Integer.parseInt(str);
            System.out.println(no);
        }catch (NumberFormatException n){
            System.out.println(n);
        }
        System.out.println("main Ended");
    }
}
