package ExtraCode;

public class DisplayUnCommonElement {
    public static void main(String[] args) {
        int[] arr={10,20,34,56,20};
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==temp){
                    count++;

                }
            }if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}
