package programing;

public class Demo24 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int number=2;
        int no=0;
        int value=1;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                if(i==0 || i==4)
                {
                    System.out.print(number+"\t");
                }

                else if(i==2)
                {
                    System.out.print(no+"\t");
                }
                else
                {
                    System.out.print(value+"\t");
                }

            }
            System.out.println();
        }
    }
}
