package programing;

public class Demo90 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int space=0;

        for(int i=1;i<=row;i++)
        {


            for (int j=1;j<=space;j++)
            {
                System.out.print(" "+"\t");

            }
            for(int k=1;k<=line;k++)
            {
                if(i==1 || i==k || k==5) {
                    System.out.print("*" + "\t");
                }
                else {
                    System.out.print(" "+"\t");
                }
            }


            System.out.println();
        }
    }
}
