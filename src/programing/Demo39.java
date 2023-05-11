package programing;

public class Demo39 {
    public static void main(String[] args) {
        int row=5;
        int line=5;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=line;j++)
            {
                System.out.print((i*j)%2+"\t");
            }
            System.out.println();
        }

    }
}
