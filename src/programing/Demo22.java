package programing;

public class Demo22 {
    public static void main(String[] args) {
        int row=5;
        int line=5;

        for(int i=0;i<row;i++)
        {
            int number=1;
            for(int j=0;j<line;j++) {
                if (j % 2 == 0) {
                    System.out.print(number + "\t");

                } else {
                    System.out.print("*\t");

                }
                number++;

            }
            System.out.println();
        }
    }
}
