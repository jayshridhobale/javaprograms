package programing;

public class Demo46 {
    public static void main(String[] args) {
        int row=5;
        int line=5;
        int num=5;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<line;j++)
            {
                if(i==j || j+i==4)
                {
                    System.out.print(num+"\t");
                }
                else {
                    System.out.print(" "+"\t");
                }

            }
            num--;
            System.out.println();
        }
    }
}
