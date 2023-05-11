package programing;

public class Demo97 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;
        char alpha='A';

        for(int i=1;i<=line;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" "+"\t");

            }
            for(int k=1;k<=star;k++ )
            {
                if(k==1 || i==5 || k==i) {
                    System.out.print("*" + "\t");
                }
                else {
                    System.out.print(alpha+"\t");
                    alpha++;
                }
            }


            star++;
            space--;
            System.out.println();
        }
    }
}
