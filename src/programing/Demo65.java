package programing;

public class Demo65 {
    public static void main(String[] args) {
        int line=5;
        int star=5;


        for(int i=1;i<=line;i++)
        {
            char al='E';
            for(int j=1;j<=star;j++)
            {
                System.out.print(al+"\t");
                al--;
            }

            star--;
            System.out.println();
        }
    }
}
