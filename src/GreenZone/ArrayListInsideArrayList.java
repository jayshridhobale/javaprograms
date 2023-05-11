package GreenZone;

import java.util.ArrayList;

public class ArrayListInsideArrayList {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");

        ArrayList<String> a2=new ArrayList<>();
        a2.add("c");
        a2.add("d");

        //a1.addAll(a2);

        ArrayList<ArrayList<String>> outerlist=new ArrayList<>();
        outerlist.add(a1);
        outerlist.add(a2);

//        for (ArrayList mystr:outerlist){
//            System.out.println(mystr);
//        }

        for (ArrayList<String> data:outerlist){
            for (String a11:data){
                System.out.println(a11);
            }
            System.out.println();
        }
    }
}
