package programing;

public class Demo96 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;

        for(int i=1;i<=line;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print("-"+"\t");
            }
            for(int k=1;k<=star;k++ )
            {
                if((k+i)%2==0)
                {
                    System.out.print("0"+"\t");
                }
                else
                {
                    System.out.print("1"+"\t");
                }

            }

            star++;
            space--;
            System.out.println();
        }
    }
}
