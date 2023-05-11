package EnCapsulation;

//Inner class Parent class Of MobileMainApp
public class Mobile {
    String  name="Samsung";
   public  class Processer{
        String proName="Snapdragon";
        void display(){
            System.out.println("Processer name is: "+proName);
        }
    }
   public class RamSize{
        String ramSize="8GB";
        void displayRamSize(){

            System.out.println("RamSize is :"+ramSize);
        }
    }
}
