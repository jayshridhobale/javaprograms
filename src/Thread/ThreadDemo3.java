package Thread;

public class ThreadDemo3 extends Thread{
    @Override
    public void run() {
        char ch='A';
        for(int a=1;a<=5;a++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(ch);
            ch++;
        }
    }
}
