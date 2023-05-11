package ExtraCode;

import java.util.HashMap;

public class frequencyOfEachElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,4,5};

        HashMap<Integer,Integer> count=new HashMap<>();
        for(int myarr:arr){
            if(count.containsKey(myarr)){
                count.put(myarr,count.get(myarr)+1);
            }
            else {
                count.put(myarr,1);
            }
        }
        System.out.println(count);
    }
}
