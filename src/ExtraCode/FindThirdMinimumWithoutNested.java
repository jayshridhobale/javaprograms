package ExtraCode;
import java.util.Arrays;
public class FindThirdMinimumWithoutNested {
    public static void main(String[] args) {
        int arr[]={10,39,20,38};
        System.out.println(Arrays.toString(arr));
        int min1=arr[0];
        int min2=arr[1];
        int min3=arr[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min1){
                min3=min2;
                min2=arr[i];
            }
            else if(arr[i]<min3 && arr[i]!=min2 && arr[i]!=min1){
                min3=arr[i];
            }
        }
        System.out.println("max1 is  :\t"+min1);
        System.out.println("max2 is  :\t"+min2);
        System.out.println("max3 is  :\t"+min3);
    }
}
