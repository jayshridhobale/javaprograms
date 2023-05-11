package ExtraCode;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 9, 10};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest no is" + arr[1]);
    }
}
