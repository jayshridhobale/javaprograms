package programing;

public class Demo85 {
    public static void main(String[] args) {
        int row=5;
        int line=5;

        int space=0;

        for(int i=1;i<=row;i++)
        {
            char ch='E';

            for (int j=1;j<=space;j++)
            {
                System.out.print(" "+"\t");
                ch--;
            }
            for(int k=1;k<=line;k++)
            {
                System.out.print(ch+"\t");
                ch--;
            }

            line--;
            space++;
            System.out.println();
        }
    }
}
