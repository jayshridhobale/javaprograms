package EnCapsulation;

public class Laptop1 {
    String company="Hp";
    class Rom{
        int ramSize=8;
        public void displayRamInfo(){
            int ramSize=8;
            System.out.println("Ram Size is:"+ramSize+"GB");
            System.out.println("Ram Tyoe is DDR4");
        }
    }
    class HardDisk{
        int hardDisk=500;
        public void displayHardDisk(){
            System.out.println(hardDisk+"GB");
            System.out.println("Hard Disk Type is SSD ");
        }

    }

}
