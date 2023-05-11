package ArraylistListFramwork;

import java.util.ArrayList;

public class MergingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> data1=new ArrayList<>();
        data1.add(10);
        data1.add(20);
        data1.add(30);
        ArrayList<Integer> data2=new ArrayList<>();
        data2.add(40);
        data2.add(50);
        data2.add(60);
        data2.addAll(data1);
        System.out.println(data2);
    }
}
