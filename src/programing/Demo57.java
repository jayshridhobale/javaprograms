package programing;

public class Demo57 {
    public static void main(String[] args) {
        int num=5;

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+"\t");
                num--;

            }
            System.out.println();
            num=5;
        }
    }
}
