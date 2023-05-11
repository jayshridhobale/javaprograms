package programing;

public class Demo74 {
    public static void main(String[] args) {
        int line=5;
        int row=5;
        char al='A';
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=row;j++)
            {
                if(i==1||j==1||(i+j)==6)
                {
                    System.out.print("*"+"\t");
                }
                else {
                    System.out.print(al+"\t");
                    al++;
                }

            }
            row--;
            System.out.println();
        }
    }
}
