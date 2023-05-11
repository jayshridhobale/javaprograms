package programing;

public class Demo70 {
    public static void main(String[] args) {
        int line=5;
       int  row=5;
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=row;j++)
            {
                System.out.print((i*j)%2+"\t");
            }
            row--;
            System.out.println();

        }
    }
}
