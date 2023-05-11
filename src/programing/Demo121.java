package programing;

public class Demo121 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        int space=0;


        for(int i=1;i<=line;i++)
        {


            for(int k=1;k<=star;k++)
            {
                if(i>k) {
                    System.out.print("0");
                }
                else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
