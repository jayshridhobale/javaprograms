package Thread;

public class ThreadDemoMain {
    public static void main(String[] args) {
        ThreadDemo3 t1=new ThreadDemo3();
        ThreadDemo3 t2=new ThreadDemo3();
        ThreadDemo3 t3=new ThreadDemo3();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
