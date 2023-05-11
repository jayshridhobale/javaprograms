package programing;

public class Demo68 {
    public static void main(String[] args) {
        int line=5;
        int row=5;
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<row;j++) {
                if (j % 2 == 0) {
                    System.out.print(1 + "\t");
                } else {
                    System.out.print(0 + "\t");
                }

            }
            row--;
            System.out.println();
        }
    }
}
