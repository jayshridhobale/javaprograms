package programing;

public class Demo79 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int num=1;
        int space=0;

        for(int i=1;i<=row;i++)
        {
            for(int k=1;k<=space;k++)
            {
                System.out.print(" "+"\t");
            }
            for(int j=1;j<=line;j++)
            {
                System.out.print(num+"\t");
            }

            space++;
            num++;
            line--;

            System.out.println();
        }
    }
}
