package programing;

public class Demo106 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;

        for(int i=1;i<=line;i++)
        {
            char alpha=(char)(64+star);

            for (int j=1;j<=space;j++)
            {
                System.out.print(" \t");
            }
            for(int k=1;k<=star;k++)
            {
                System.out.print(alpha+"\t");
                alpha--;
            }
            star=star+2;
            space--;
            System.out.println();
        }
    }

}
