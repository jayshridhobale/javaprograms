package programing;

public class Demo146 {
    public static void main(String[] args) {
        int no=28;
        int sum=0;
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
            {
                sum=sum+i;
            }
        }
        if(no==sum)
        {
            System.out.println(sum);
            System.out.println("no is perfect ");
        }
        else {
            System.out.println("no is not perfect");
        }
    }
}
