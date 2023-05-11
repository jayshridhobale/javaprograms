package programing;

public class Demo125 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");

            }
            for(int k=1;k<=star;k++)
            {
                System.out.print("* ");
            }
            space--;
            star++;
            System.out.println();
        }
        star=4;
        space=1;
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");

            }
            for(int k=1;k<=star;k++)
            {
                System.out.print("* ");
            }
            space++;
            star--;
            System.out.println();
        }


    }
}
