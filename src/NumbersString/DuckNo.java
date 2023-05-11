package NumbersString;

public class DuckNo {
    public static void main(String[] args) {
        int no=0376;
        int rem=0;
        boolean status=false;
        while (no!=0) {
            rem = no % 10;

            if (rem == 0) {
                status = true;
                break;

            }
            no = no / 10;
        }
        if(status)
        {
            System.out.println("Not a Duck number");
        }
        else {
            System.out.println("Duck number");
        }

    }

}
