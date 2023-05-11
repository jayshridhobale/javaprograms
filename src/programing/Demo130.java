package programing;

public class Demo130 {
    public static void main(String[] args) {
        int line = 9;
        int star = 1;
        int space = 4;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= star; k++) {
                if(k==1||k==i||(i+k)==10) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();

            if(i<5)
            {
                star++;
                space--;
            }
            else {
                star--;
                space++;
            }
        }
    }

}
