package programing;

public class Demo101 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;
        int num=1;
        for(int i=1;i<=line;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" \t");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print(num+"\t");
                num++;
            }
            star=star+2;
            num=1;
            space--;
            System.out.println();
        }
    }
}
