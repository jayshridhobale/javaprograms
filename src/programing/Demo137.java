package programing;

public class Demo137 {
    public static void main(String[] args) {
        int line = 5;
        int space = 5;
        int num=1;
        for (int i = 1; i <= line; i++) {
            int num2=num;
            int num3=4;
            for (int j = 1; j <= space; j++) {

                System.out.print(num2+"\t");
                num2=num2+num3;
                num3--;
            }
            num++;

            System.out.println();

        }

    }

}
