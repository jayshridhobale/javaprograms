package NumbersString;

public class XylemOrPhloemNo {
    public static void main(String[] args) {
        int no=13518;
        int i=0;
        int [] arr=new int [5];
        while(no>0)
        {
            arr[i]=no%10;
            no=no/10;
            i++;
        }
        int sum1=0,sum2=0;
        for(int j=0;j<arr.length;j++)
        {
            if(j==0 || j==arr.length-1)
            {
                sum1+=arr[j];
            }
            else {
                sum2+=arr[j];
            }
        }
        System.out.println(sum1+"\t"+sum2);
        if(sum1==sum2)
        {
            System.out.println("xylen number");
        }
        else {
            System.out.println("not xylen number");
        }
    }
}
