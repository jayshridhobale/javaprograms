package programing;

public class Demo25 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int number=2;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                if(i==0 || i==4)
                {
                    System.out.print(number+"\t");
                }
                else if (i==1 || i==3) {
                    System.out.print((number-1)+"\t");

                }
                else
                {
                    System.out.print((number-2)+"\t");
                }
            }
            System.out.println();
        }

    }
}
