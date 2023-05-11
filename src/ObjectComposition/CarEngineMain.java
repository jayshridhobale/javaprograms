package ObjectComposition;

public class CarEngineMain {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.drive();
//        c1.e1.start();
//        c1.e1.stop();  Or

        Car.e1.start();
        Car.e1.stop();

    }
}
