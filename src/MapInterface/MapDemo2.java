package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> batches=new HashMap<>();
        batches.put("1CCM24","Java");
        batches.put("1EJA7","J2EE");
        batches.put("1CCM25","Java");
        batches.put("1EHA3","Hibernate");
        batches.put("1CCM24","sql");
        System.out.println(batches);
        System.out.println("===================");
        Set<String > batchcodes=batches.keySet();
        System.out.println(batchcodes);

        Collection<String> cources=batches.values();
        System.out.println(cources);
        System.out.println("BatchCode \t\t subject");
        System.out.println("==============================");
        Set<Map.Entry<String,String>> courseInfo=batches.entrySet();
        for(Map.Entry<String,String> e:courseInfo){
            System.out.println(e.getKey()+"\t\t"+e.getValue());
        }
    }
}
