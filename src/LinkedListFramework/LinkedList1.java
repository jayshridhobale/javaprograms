package LinkedListFramework;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> linked=new LinkedList<>();
        linked.add(30);
        linked.add(40);
        linked.add(45);
        linked.add(19);
        System.out.println(linked);
        linked.remove();
        System.out.println(linked);
    }
}
