package ExtraCode;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());
    }
}
