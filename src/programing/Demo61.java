package programing;

public class Demo61 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        int num=5;
        for(int i=0; i<line;i++)
        {
            for(int j=0;j<star;j++)
            {
                if (i<=j){
                    System.out.print(num+"\t");
                }

            }
            num--;
            System.out.println();
        }
    }
}
