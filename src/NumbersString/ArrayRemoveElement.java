package NumbersString;

import java.util.Scanner;

public class ArrayRemoveElement {
    public static void main(String[] args) {
        int [] demo={10,20,30,40,50};

        for(int i=0;i< demo.length;i++)
        {
            System.out.print(demo[i]+" ");
        }
        System.out.println("enter number to delete from an array");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        int loc=0, flag=1;
        for(int i=0;i< demo.length;i++)
        {
            if(demo[i]==no)
            {
                loc=i;
                flag=1;
                break;
            }else {
                flag=0;
            }

        }
        System.out.println();
        if(flag==1)
        {
            for(int i=loc+1;i<demo.length;i++)
            {
                demo[i-1]=demo[i];
            }
            for(int i=0;i<demo.length-1;i++)
            {
                System.out.print(demo[i]+" ");
            }
        }
    }
}
