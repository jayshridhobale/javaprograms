package programing;

public class Demo31 {
    public static void main(String[] args) {
        int row=5;
        int line=5;


        for(int i=0;i<row;i++)
        {
            int num=1;
            for(int j=0;j<line;j++)
            {
                System.out.print(num+i+"\t");
                num++;
            }

            System.out.println();
        }
    }
}
