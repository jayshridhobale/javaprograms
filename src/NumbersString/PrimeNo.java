package NumbersString;

public class PrimeNo {
    public static void main(String[] args) {
        int no=12;
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
            System.out.println("prime number");
        }
        else if(no==1) {
            System.out.println(" prime number");
        }
        else {
            System.out.println("not prime number");
        }

    }
}
