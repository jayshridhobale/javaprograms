package ExtraCode;

public class ExtraDemo1 {

    public static void main(String[] args) {
        int[] arr = {20, 50, 10, 30, 40};

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }

            }
        }
    }
}



