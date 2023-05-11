package Thread;

public class PracticeMain {
    public static void main(String[] args) {
        Practice1 p1=new Practice1();
        p1.start();
        ThreadDemo1 t1=new ThreadDemo1();
        t1.start();
    }
}
