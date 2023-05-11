package ArraylistListFramwork;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Double> data=new ArrayList<>();
        data.add(78.25);
        data.add(12.45);
        data.add(37.85);
        data.add(1,98.45);
        data.add(63.74);
        data.set(2,95.34);
        data.remove(3);
        data.add(2,54.25);
        data.remove(78.25);
        data.get(3);
        System.out.println(data);
    }
}
