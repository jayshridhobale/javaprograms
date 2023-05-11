package String;

public class StringAdditionProgram {
    public static void main(String[] args) {
        String str="a1c1e1";
        char[]arr= str.toCharArray();
        for (int i=1;i< arr.length;i+=2) {
            char a = arr[i - 1];
            int b = arr[i] - '0';
            arr[i] = (char) (a + b);
        }

        System.out.println(arr);
    }
}
