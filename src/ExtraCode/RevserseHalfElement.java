package ExtraCode;

public class RevserseHalfElement {
    public static void main(String[] args) {
        int[] arr={4,3,5,6,8,10};
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
            System.out.println(arr[i]);
        }
    }
}
