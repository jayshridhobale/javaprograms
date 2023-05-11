package ExceptionHandling;

public class Exception6 {
    public static void main(String[] args) {
        String str=null;
        try{
            System.out.println("Try started");
            System.out.println(str.length());
            System.out.println("Try ended");
            //System.exit(0);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
            finally {
            System.out.println("closing costly Resources");
        }
        System.out.println("Main ended");
    }
}
