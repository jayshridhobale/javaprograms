package programing;

public class Demo99 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        int space=4;


        for(int i=1;i<=line;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");

            }
            for(int k=1;k<=star;k++ )
            {

                    System.out.print("* ");


                }

            star++;
            space--;
            System.out.println();
            }



    }
}
