package programing;

public class Demo28 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        char alpha='C';

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                System.out.print(alpha+"\t");
            }
            if(i<2)
            {
                alpha--;

            }
            else {
                alpha++;

            }
            System.out.println();
        }
    }
}
