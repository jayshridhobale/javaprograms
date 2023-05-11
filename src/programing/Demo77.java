package programing;

public class Demo77 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int space=0;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=line;k++)
            {
                System.out.print("* ");
            }
            space++;
            line--;
            System.out.println();

        }
    }
}
