package ExtraCode;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int arr[]={10,32,43,76,90};
        int delete=32;
        for(int i=0;i<arr.length;i++){
            if(delete==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
