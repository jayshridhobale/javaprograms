package ExtraCode;

public class Find3MinimumElement {
    public static void main(String[] args) {
        int[] arr={10,202,412,-1,32};
        int min;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    min=arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;
                }
            }
        }
        System.out.println("Three minimum Element is:\t"+arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
