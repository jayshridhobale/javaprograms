package ExceptionHandling;

 class BirthException extends Exception{
    public BirthException(String date){
      super(date);
    }
}
public class DateOfBirth{
     static void birthDate(int date) throws BirthException{
         if(date<2000){
             throw new BirthException("BirthDate is incorrect" );
         }
         else {
             System.out.println("Birthdate is correct");
         }
     }
    public static void main(String[] args) {
        try {
            birthDate(1998);
        } catch (BirthException e) {
            System.out.println("Exception occured " +e);
        }
    }
}