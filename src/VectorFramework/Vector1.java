package VectorFramework;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector data=new Vector();
        data.add(25);
        data.add(30.25);
        data.add("jayshri");
        data.add('j');
        data.add(false);
        System.out.println(data);
        System.out.println("=============");
        for(Object o:data){
            System.out.println(o);
        }
    }
}
