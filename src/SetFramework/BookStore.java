package SetFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class BookStore {

    HashSet<String> bookset = new HashSet<>();
    LinkedHashSet<String> cartItem = new LinkedHashSet<>();

    {
        bookset.add("Java");
        bookset.add("SQL");
        bookset.add("Hibernate");
        bookset.add("J2EE");
    }

    void displayAllBooks() {
        System.out.println("Book Name");
        System.out.println("=====================");
        for (String s : bookset) {
            System.out.println(s);
        }
    }
    void addToCart(String bookName) {
        boolean found=bookset.contains(bookName);
        if(found) {
            cartItem.add(bookName);
            System.out.println("Book added to cart");
        }
        else {
            System.out.println("Book not found");
        }
        System.out.println();
    }
    void viewCartItems() {
        System.out.println("Book Name");
        System.out.println("================");
        for (String s : cartItem) {
            System.out.println(s);
        }
    }

    void removeCartItems(String bookName) {
        boolean found = cartItem.contains(bookName);

        if (found) {
            cartItem.remove(bookName);
            System.out.println("book remove from cart");
        } else {
            System.out.println("First add to cart");
        }

    }

}