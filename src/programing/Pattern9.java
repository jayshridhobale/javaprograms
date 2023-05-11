package programing;

public class Pattern9 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                if(j==i || i+j==1 || j+i==7)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
