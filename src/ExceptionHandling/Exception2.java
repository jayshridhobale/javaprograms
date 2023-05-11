package ExceptionHandling;

public class Exception2 {
    public static void main(String[] args) {
        int[] arr=new int[4];
        try{
            arr[5]=20;
            System.out.println(arr[5]);
        }catch (Exception e){   //generic handler
            System.out.println(e);
        }
        System.out.println("Program ended");
    }
}
