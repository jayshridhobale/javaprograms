package Important;
//write a program to duplicate element from the arraylist using java

import java.util.ArrayList;
import java.util.HashSet;
public class DuplicateusingArraylist {
        public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
            return new ArrayList<>(new HashSet<>(list));
        }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(1);
            list.add(2);
            System.out.println("Original list: " + list);
            System.out.println("List without duplicates: " + removeDuplicates(list));
        }
}
