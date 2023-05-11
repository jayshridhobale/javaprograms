package Casting;
//Executable class
public class DemoSampleMain {
    public static void main(String[] args) {
        Demo d1=new Sample();    //upcasting -access only Genral information
        d1.test();


        System.out.println("===============================");
        Sample s1=new Sample();
        s1.display();
        s1.test();

    }
}
