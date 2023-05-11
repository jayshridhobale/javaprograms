package Important;
//Write a program to demostrate custom exception in java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void divide(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Cannot divide by zero");
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
