package programing;

public class Demo87 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        char ch='E';

        int space=0;

        for(int i=1;i<=row;i++)
        {


            for (int j=1;j<=space;j++)
            {
                System.out.print(" "+"\t");

            }
            for(int k=1;k<=line;k++)
            {
                System.out.print(ch+"\t");

            }
            ch--;
            line--;
            space++;
            System.out.println();
        }
    }
}
