package NumbersString;

public class ArrAddition {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,-1,6,8};
        int sum=7;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println("pair is {"+arr[i]+","+arr[j]+"}");
                }
            }
        }
    }
}
