package ExtraCode;

public class Find3LargestElement {
    public static void main(String[] args) {
        int[] arr={100,2,4000,456,87,034,7000};
        int max;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                   max=arr[i];
                   arr[i]=arr[j];
                   arr[j]=max;
                }
            }
        }
        System.out.println("3 largest element is:\t"+arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
