package programing;

public class Demo124 {
    public static void main(String[] args) {
        int line=5;
        int star=5;



        for(int i=1;i<=line;i++)
        {
            int no=5-i;
            for(int k=1;k<=star;k++)
            {
                System.out.print((Math.abs(no)+" "));
                no--;
            }

            System.out.println();
        }
    }
}
