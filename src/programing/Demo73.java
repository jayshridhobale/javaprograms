package programing;

public class Demo73 {
    public static void main(String[] args) {
        int line=7;
        int row=7;
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=row;j++)
            {
                if(i==1 || j==1 || (i+j)==8)
                {
                    System.out.print("*"+"\t");
                }
                else
                {
                    System.out.print(" "+"\t");
                }
            }
            row--;
            System.out.println();
        }
    }
}
