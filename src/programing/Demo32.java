package programing;

public class Demo32 {
    public static void main(String[] args) {


        int row = 5;
        int line = 5;
        int num = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(num + 2 * j + "\t");
            }
            num++;
            num++;
            System.out.println();
        }
    }
}
