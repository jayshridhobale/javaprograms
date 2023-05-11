package ExtraCode;

public class FindSecondMinElement {
    public static void main(String[] args) {
        int[] arr={22,44,98,76,56,1};
        int min;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    min=arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;
                }
            }
        }
        System.out.println("Second smallest number is :" +arr[1]);
    }
}
