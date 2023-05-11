package programing;

public class Demo27 {
    public static void main(String[] args) {
        int row=5;
        int line=5;


        for(int i=0;i<row;i++)
        {
            int number=2;
            for(int j=0;j<line;j++) {
                System.out.print(number + "\t");

                if (j < 2) {
                    number--;

                } else {
                    number++;
                }
            }

            System.out.println();
        }
    }
}
