package programing;

public class Demo117 {
    public static void main(String[] args) {
        int line=5;
        int star=9;
        int space=0;


        for(int i=1;i<=line;i++)
        {
            int num=10-i;
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print(num+" ");
                num--;

            }

            star=star-2;
            space=space+2;
            System.out.println();
        }
    }
}
