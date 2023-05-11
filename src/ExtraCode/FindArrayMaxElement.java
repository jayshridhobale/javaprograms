package ExtraCode;

public class FindArrayMaxElement {
    public static void main(String[] args) {
        int[] arr={4,3,5,6,2,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
