package ExtraCode;
public class AnagramUsingBubbleSort {
    public static void main(String[] args) {
        String str1 = "army";
        String str2 = "mary";

        boolean status = true;

        if (str1.length() == str2.length()) {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            sort(arr1);
            sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    status = false;

                }
                if (status)
                    System.out.println("given String is Anagram");
                else
                    System.out.println("given String is not an Anagram");
                break;
            }
        } else {
            System.out.println("given string is not anagram");

        }
    }
    public static void sort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
