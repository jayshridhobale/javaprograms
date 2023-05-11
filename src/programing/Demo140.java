package programing;

public class Demo140 { public static void main(String[] args) {
    int line=5;
    int row=5;


    for(int i=0;i<=line;i++)
    {
        int num=1;
        num+=i;
        for(int j=0;j<=row;j++)
        {
            if(i>j)
            {
                System.out.print(num+"\t");
                num=num+2;
            }
        }
        System.out.println();
    }
}
}
