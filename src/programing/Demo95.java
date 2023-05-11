package programing;

public class Demo95 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;
        char alph='A';
        for(int i=1;i<=line;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print("-"+"\t");

            }
            for(int k=1;k<=star;k++ )
            {
                System.out.print(alph+"\t");
                alph++;
            }

            alph='A';
            star++;
            space--;
            System.out.println();
        }
    }
}
