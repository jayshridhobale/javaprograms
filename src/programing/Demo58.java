package programing;

public class Demo58 {
    public static void main(String[] args) {
        char s='*';
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i<=j) {


                    System.out.print(s + "\t");
                }
            }
            System.out.println();
        }

    }
}
