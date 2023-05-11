package Thread;

public class Practice1 extends ThreadDemo1 implements Runnable {


    @Override
    public void run() {
        System.out.println("Run method");
       demo();

    }

    static void demo() {
        System.out.println("Demo method");
    }
}
