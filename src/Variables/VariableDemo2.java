package Variables;
import java.util.Scanner;
 class VariableDemo2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Eneter the no");
        double no = s1.nextDouble();
        VariableDemo2 v1=new VariableDemo2();
        v1.sqaure(no);
    }

        void sqaure(double a) {
            System.out.println("Sqaure of number" + (a * a));


        }
}
