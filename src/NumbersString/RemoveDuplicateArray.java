package NumbersString;

public class RemoveDuplicateArray {
        public static void main(String[] args) {
            int[] arr = {0, 0, 1, 1, 1, 2, 2, 5, 3, 3};
            if (arr.length == 0 || arr.length == 1) {
                System.out.println(arr.length);
            }
            System.out.println(arr.length);
            int j = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    arr[j++] = arr[i];
                }
            }
            arr[j++] = arr[arr.length - 1];
            System.out.println(j);
            for (int a : arr) {
                System.out.print(a + " ");
            }
        }
    }

