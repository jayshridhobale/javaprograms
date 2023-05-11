package ExtraCode;


import java.util.Arrays;

public class SecondLargestWithoutNestedLoop {
    public static void main(String[] args) {
        int[] arr={70,26,38,36,90};
        System.out.println(Arrays.toString(arr));
        int max1=arr[0];
        int max2=arr[1];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if (arr[i]>max2 && arr[i]!=max1)  {
              max2=arr[i];
          }
        }
        System.out.println("first max "+max1);
        System.out.println("second max "+max2);
    }
}
