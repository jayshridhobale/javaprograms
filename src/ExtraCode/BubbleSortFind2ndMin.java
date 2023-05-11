package ExtraCode;

public class BubbleSortFind2ndMin {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 9, 10};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[1]);
            break;
        }
    }

}
