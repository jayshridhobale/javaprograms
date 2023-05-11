package programing;

public class Demo20 {
    public static void main(String[] args) {


        int row = 5;
        int line = 5;
        int number = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(number + "\t");
            }
            System.out.println();
            number++;
        }
    }
}
