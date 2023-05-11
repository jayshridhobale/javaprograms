package programing;

public class Demo49 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        char star='*';

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(star+"\t");
            }
            System.out.println();

        }
    }
}
