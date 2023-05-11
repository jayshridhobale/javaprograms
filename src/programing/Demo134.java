package programing;

public class Demo134 {
    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        int space = 4;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            space--;
            System.out.println();


        }
    }
}
