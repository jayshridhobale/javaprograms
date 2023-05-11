package programing;

public class Demo89 {
    public static void main(String[] args) {
        int row=5;
        int line=5;


        for(int i=0;i<row;i++)
        {



            for(int k=0;k<line;k++)
            {
                if((i+k)==4 || i==0 || k==0) {

                    System.out.print("*" + "\t");
                }
                else
                {
                    System.out.print(" "+"\t");
                }

            }


            System.out.println();
        }
    }
}
