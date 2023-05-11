package programing;

public class Demo11 {
    public static void main(String[] args) {
        int star=5;
        int line=5;

        for (int i=0;i<star;i++)
        {
            for (int j=0;j<line;j++)
            {
                if(i==0 || j==0 || i==4 || j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
