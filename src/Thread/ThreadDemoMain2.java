package Thread;

public class ThreadDemoMain2 {
    public static void main(String[] args) {

        ThreadDemo2 d1=new ThreadDemo2(); //normal object
        ThreadDemo2 d2=new ThreadDemo2(); //normal object

        Thread t1=new Thread(d1);  //Thread Object
        Thread t2=new Thread(d2);  //Thread Object
        t1.start();
        t2.start();
    }
}
