package NumbersString;

public class rightShift {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println("array before rotating");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<1;i++)
        {
            int j,right=arr[arr.length-1];
            for(j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[j]=right;
        }
        System.out.println("arrray after rotation");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
