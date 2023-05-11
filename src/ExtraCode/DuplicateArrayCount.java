package ExtraCode;

import java.util.HashMap;

public class DuplicateArrayCount {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,1,2,3};
        for (int i=0;i<arr.length;i++){
            int count=1;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if (count>1) {
                    System.out.println("Element is :\t" + arr[j] + "count is \t" + count);
                    break;
                }
            }

        }
    }
}
