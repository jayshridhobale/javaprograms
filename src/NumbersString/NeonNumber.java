package programing;

public class NeonNumber {
    public static void main(String[] args) {


        int no = 9;
        int square = no * no;
        int sum = 0, temp = 0;
        while (square > 0) {
            temp = square % 10;
            sum = sum + temp;
            square=square/10;

        }
        if(no==sum)
        {
            System.out.println("neon number");
        }
        else {
            System.out.println("not a neon number");
        }
    }


}
