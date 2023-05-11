package programing;

public class Demo17 {
    public static void main(String[] args) {
        int star=5;
        int line=5;
        for (int i=0;i<star;i++)
        {
            for ( int j=0;j<line;j++)
            {
                if((j+i)%2!=0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
