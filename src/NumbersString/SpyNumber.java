package programing;

public class SpyNumber {
    public static void main(String[] args) {
        int no=1124;
        int num=no;
        int temp=0,sum=0,multi=1;
        while(no>0)
        {
            temp=no%10;
            sum+=temp;
            multi*=temp;
            no=no/10;
        }
        if(sum==multi)
        {
            System.out.println("spy number");
        }
        else
        {
            System.out.println("not spy number");
        }
    }
}
