package programing;

public class Demo122 {
    public static void main(String[] args) {
        int line=5;
        int star=5;



        for(int i=1;i<=line;i++)
        {

            for(int k=1;k<=star;k++)
            {
                System.out.print((Math.abs(i-k)+" "));
            }

            System.out.println();
        }
    }
}
