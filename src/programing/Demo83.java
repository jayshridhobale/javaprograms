package programing;

public class Demo83 {
    public static void main(String[] args) {
        int row=5;
        int line=5;

        int space=0;

        for(int i=1;i<=row;i++)
        {
            int num=5;
            for (int j=1;j<=space;j++)
            {
                System.out.print(" "+"\t");
            }
            for(int k=1;k<=line;k++)
            {
                System.out.print(num+"\t");
                num--;
            }

            line--;
            space++;
            System.out.println();
        }
    }
}
