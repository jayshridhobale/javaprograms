package MethodOverloading;

public class Facebook {

    String username = "admin";
    String password = "1234";

    long contact = 12345l;

    void login(String user, String pass) {
        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Sucessfully");
        }
        else {
            System.out.println("Invalid Login details");
        }
    }

    void login(long con, String pass) {
        if (con == contact && pass.equals(password)) {
            System.out.println("Login Sucessfully");
        } else {
            System.out.println("Invalid Login details");
        }
    }

}
