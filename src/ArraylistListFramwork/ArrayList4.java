package ArraylistListFramwork;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<>();
        data.add(22);
        data.add(33);
        data.add(44);
        data.add(55);

        //step 4 iterator interface for Printing ArrayList
        //
        Iterator<Integer> itr=data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()); //select
            itr.remove(); //to use  ConcurrentModificationException-->it means to perform 2 parallel operations add and remove
        }
        System.out.println("=====================================");
        System.out.println(data);
    }
}
