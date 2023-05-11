package programing;

public class Demo50 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int num=1;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                if(i>=j)
                {
                    System.out.print(num+"\t");
                    num++;

                }

            }
            num=1;
            System.out.println();
        }
    }
}
