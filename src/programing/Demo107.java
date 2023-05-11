package programing;

public class Demo107 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;
        int num=5;
        for(int i=1;i<=line;i++)
        {

            for (int j=1;j<=space;j++)
            {
                System.out.print(" \t");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print(num+"\t");

            }
            star=star+2;
            num--;
            space--;
            System.out.println();
        }
    }
}
