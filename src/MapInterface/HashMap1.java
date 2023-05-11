package MapInterface;
//stored data in random format

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> data=new HashMap<>();
        data.put(201,"goku");
        data.put(101,"Jayu");
        data.put(509,"akshu");
        data.put(495,"vaish");
        data.put(201,"chetan");
        System.out.println(data);
    }
}
