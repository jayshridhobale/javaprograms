package AbstractClass;
import java.util.Scanner;
public class CarMainApp {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Select Models");
        System.out.println("0:Manual\n1:Automatic");
        int model=s1.nextInt();
        if(model==0 || model==1) {
            System.out.println("Select Service Provider:");
            System.out.println("1:Tata\n2:Toyota\n3:Haynda");
            int provider = s1.nextInt();
            System.out.println("Select Service ");
            System.out.println("0:Free Service\n1:Paid Service");
            int serviceType = s1.nextInt();

            Car c1 =null;
            if (provider == 1) {
                c1 = new Tata();
            } else if (provider==2) {
                c1=new Hyundai();
            } else if (provider==3) {
                c1=new Toyota();

            }
            c1.bookService(model, serviceType);
        }
        else {
            System.out.println("Invalid model type.");
        }
    }
}
