package ArraylistListFramwork;

import java.util.Collections;
import java.util.LinkedList;

public class SortingArrayList {
    public static void main(String[] args) {
        LinkedList<Double> data=new LinkedList<>();
        data.add(12.24);
        data.add(98.74);
        data.add(74.76);
        data.add(79.43);
        data.add(37.45);
        System.out.println(data);
        System.out.println("=======After sorting data Ascending order=======");
        Collections.sort(data);
        System.out.println(data);
        System.out.println("=======Sorting data Descending order===========");
        Collections.sort(data,Collections.reverseOrder());
        System.out.println(data);
    }
}
