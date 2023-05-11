package Important;

import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        int[] numbers = {1221, 12345, 45678, 123321, 121, 1458, 8558};

        System.out.println("Input Array: " + Arrays.toString(numbers));
        System.out.print("Palindrome Numbers: ");
        for (int num : numbers) {
            if (isPalindrome(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            num /= 10;
        }
        return originalNum == reverseNum;
    }
}


