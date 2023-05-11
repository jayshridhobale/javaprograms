package Constructor;


//Programm Flow of the static,non-static block and Constructor,and normal methed
class Master {
    Master() {
        System.out.println("Constructor of master");
    }

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Non- Static Block");
    }
}

public class ConstructorDemo3 {
    public static void main(String[] args) {
        System.out.println("Main method");
        Master m1 = new Master();
        info();
    }
   static void info(){
        System.out.println("info method");

}
}
