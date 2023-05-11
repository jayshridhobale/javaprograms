package Thread;

public class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started");
        test();
    }
    public void test(){
        System.out.println("Test method");
    }
}
