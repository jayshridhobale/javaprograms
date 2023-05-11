package Interface;

public class MusicPlayerMainApp {
    public static void main(String[] args) {
        MusicPlayer m1;           //upcasting or loose coupling
        m1=new DVD();
        m1.play();
        m1.pause();
        m1.forward();
        m1.backword();
        System.out.println("==================================================================");
        m1=new Walkman();            //upcasting or loose coupling
        m1.play();
        m1.pause();
        m1.forward();
        m1.backword();
    }
}
