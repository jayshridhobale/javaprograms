package programing;

public class Demo67 {
    public static void main(String[] args) {
        int line =5;
        int row=5;
        int no=1;

        for(int i=0;i<line;i++)
        {
            for(int j=0;j<row;j++)
            {
                if(i<=j) {
                    System.out.print(no + "\t");
                    no++;
                }

            }


            System.out.println();
        }
    }
}
