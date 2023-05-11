package SetFramework;

import java.util.Scanner;

public class BookMainApp {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        BookStore books=new BookStore();
        boolean status=true;
        while(status){
            System.out.println("Select Operation");
            System.out.println("1:View Book Item");
            System.out.println("2:Add to cart");
            System.out.println("3:View Cart Item");
            System.out.println("4:Remove from cart");
            System.out.println("5:Exit");
            int choice=s1.nextInt();

            switch(choice){
                case 1:books.displayAllBooks();
                break;
                case 2: System.out.println("Enter the name of the book:");
                        String name=s1.next();
                        books.addToCart(name);
                case 3:books.viewCartItems();
                break;
                case 4: System.out.println("Enter the name of the book:");
                      String bName=s1.next();
                      books.removeCartItems(bName);
                      break;
                      default:
                          status=false;
            }
        }
    }
}
