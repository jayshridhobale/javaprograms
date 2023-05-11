package StringFunction;

public class StringFunction2 {


    public static void main(String[] args) {
        String str = "MAHARASHTRA";
        System.out.println(str);
        System.out.println(str.toCharArray());
        System.out.println("===============");
        char[] data = str.toCharArray();

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("===============");
        for (int i = data.length-1; i >= 0; i--) {
            System.out.println(data[i]);
        }

    }
}