package programing;

public class Demo47 {
    public static void main(String[] args) {
        int row =5;
        int line=5;
        char alpha='A';

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                if(i>=j)
                {
                    System.out.print(alpha+"\t");
                }



            }
            alpha++;
            System.out.println();

        }
    }
}