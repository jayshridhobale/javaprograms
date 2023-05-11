package programing;

public class PrimeNo2 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
            prime(i);
        }

    }
    public static void prime(int no)
    {
        int count=0;
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("prime number is "+no);
        }
    }
}
