package programing;

public class Demo42 {
    public static void main(String[] args) {
        int line=5;
        int row=5;
        char a='A';
        for (int i=0;i<line;i++)
        {
            for (int j=0;j<row;j++)
            {
                if(i>=j) {
                    System.out.print(a + "\t");
                }
                a++;
            }
            a='A';
            System.out.println();
        }
    }
}
