package NumbersString;

public class leftShiftj {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println("array before rotating");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<1;i++)
        {
            int j,left=arr[0];
            for(j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=left;
        }
        System.out.println("arrray after rotation");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
