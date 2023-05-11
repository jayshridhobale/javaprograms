package programing;

public class Demo40 {
    public static void main(String[] args) {
        int row=5;
        int line=5;

        for(int i=1;i<=row;i++)
        {
            for (int j=1;j<=line;j++)
            {
                if(i==j || (i*j)%2!=0 || i+j==6 )
                {
                    System.out.print(1+"\t");
                }
                else {
                    System.out.print(0+"\t");
                }
            }
            System.out.println();
        }
    }
}
