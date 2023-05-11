package programing;

public class Demo29 {
    public static void main(String[] args) {


        int row = 5;
        int line = 5;

        for (int i = 0; i < row; i++) {
            char alpha = 'C';

            for (int j = 0; j < line; j++) {
                System.out.print(alpha+"\t ");
                if (j < 2) {
                    alpha--;

                } else {
                    alpha++;
                }
            }
            System.out.println();
        }
    }
}
