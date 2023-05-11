package ExtraCode;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        link.add(10);
        link.add(20);
        link.add(30);
        link.add(40);
        System.out.println(link);

        LinkedList link2=new LinkedList();
        link.descendingIterator().forEachRemaining(link2::add);
        System.out.println(link2);
    }
}
