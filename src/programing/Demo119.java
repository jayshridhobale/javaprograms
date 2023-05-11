package programing;

public class Demo119 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        int space=0;


        for(int i=1;i<=line;i++)
        {

            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++)
            {
                if(i==1 || k==1 || (i+k)==6) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            star--;
           space=space+1;
            System.out.println();
        }
    }
}
