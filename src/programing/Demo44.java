package programing;

public class Demo44 {
    public static void main(String[] args) {
        int row=5;
        int line=5;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                if(i>=j)
                {
                System.out.print("*"+"\t");
                }
            }
            System.out.println();
        }

    }
}
