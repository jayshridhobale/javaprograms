package programing;

public class Demo133 {

    public static void main(String[] args) {
        int line = 5;
        int star = 5;
        int space = 5;
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= space; j++) {
                if(j<i)
                {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print(i+" ");
                }

            }
            System.out.println();

        }
    }
}
