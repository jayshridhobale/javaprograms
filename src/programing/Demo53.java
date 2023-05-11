package programing;

public class Demo53 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for (int j=0;j<=5;j++)
            {
                if(i>j) {
                    System.out.print(i % 2 + "\t");
                }
            }
            System.out.println();
        }
    }
}
