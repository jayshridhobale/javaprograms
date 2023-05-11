package MethodOverloading;

public class MainMethod {
    //Standard Main method
    public static void main(String[] args) {
        System.out.println("Main Method 1");
        main(1);
        main('j');
    }

    public static void main(int args) {
        System.out.println("Main method 2");

    }

    public static void main(char args) {
        System.out.println("Main method 3");

    }

}
