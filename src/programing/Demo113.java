package programing;

public class Demo113 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        int space=0;
        int num=5;

        for(int i=1;i<=line;i++)
        {

            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print(num+" ");

            }
            num--;
            star--;
            space++;
            System.out.println();
        }
    }
}
