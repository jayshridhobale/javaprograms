package ArraylistListFramwork;

import java.util.ArrayList;

//Non-Generic Arraylist-it means heterogenous type of data
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add("jayshri");
        al.add(20.30);
        al.add(true);
        al.add(null);
        al.add('j');
        System.out.println(al);
    }
}
