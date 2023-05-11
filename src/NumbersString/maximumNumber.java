package NumbersString;

public class maximumNumber {
    public static void main(String[] args) {
        int arr[]={10,80,30,40,90,95,85};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int n=3;
        System.out.println("array in ascending order");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(n+"3rd maximum number is "+arr[arr.length-n]);
        System.out.println("array in decending order");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
