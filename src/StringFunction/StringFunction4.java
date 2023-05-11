package StringFunction;

public class StringFunction4 {
    public static void main(String[] args) {
        String str1 ="";
        boolean val1 = str1.isEmpty();

        String str2 = "JAVA";
        boolean val2 = str2.isEmpty();

        System.out.println(val1);
        System.out.println(val2);

        System.out.println(str2.replace('A', '@'));

        String str3 = "Programmer";
        System.out.println(str3.replace("r", ""));
        System.out.println(str3.replace("mm", ""));

        String str4 = "Jayshri";
        char[] data = str4.toCharArray();

        for(int i=data.length-1; i>=0; i--) {
            System.out.print(data[i] + " ");
        }
    }

}
