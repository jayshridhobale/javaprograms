package programing;

public class Demo38 {
    public static void main(String[] args) {
        int row=5;
        int line=5;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=line;j++)
            {
                if(i%2==0 || j%2==0)
                {
                    System.out.print(0+"\t");
                }
                else {
                    System.out.print(1+"\t");
                }
            }
            System.out.println();
        }

    }
}
