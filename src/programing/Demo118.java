package programing;

public class Demo118 {
    public static void main(String[] args) {
        int line=5;
        int star=5;


        for(int i=1;i<=line;i++)
        {

            for(int k=1;k<=star;k++)
            {
                if(i==1 || k==1 || (i+k)==6) {
                    System.out.print("*"+"\t");
                }
                else {
                    System.out.print(" "+"\t");
                }
            }

            System.out.println();
        }
    }
}
