package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        Map<Integer,String> data=new TreeMap<>();
        data.put(201,"goku");
        data.put(101,"Jayu");
        data.put(509,"akshu");
        data.put(495,"vaish");
        System.out.println(data);
    }
}
