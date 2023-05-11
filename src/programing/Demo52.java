package programing;

public class Demo52 {
    public static void main(String[] args) {
        int row=5;
        int line=5;


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                if(i>=j && i%2==0)
                {
                    System.out.print(1+"\t");

                } else if (i>=j && i%2!=0)
                {
                    System.out.print(0+"\t");
                }
            }
            System.out.println();
        }
    }
}
