package programing;

public class Demo127 {
    public static void main(String[] args) {
        int line = 9;
        int star = 1;
        int space = 4;
        int num=1;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= star; k++) {
                System.out.print(num+" ");
            }

            System.out.println();

            if(i<5)
            {
                num++;
                star++;
                space--;
            }
            else {
                num++;
                star--;
                space++;
            }
        }
    }
}
