package NumbersString;
// Q1: find the count of vowels and constants in string using recursion input=THIS IS QSPIDER PLACEMENT DRIVE
public class VowelCounter {
        public static int countVowels(String input, int index) {
            if (index == input.length()) return 0;

            char current = Character.toLowerCase(input.charAt(index));
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                return 1 + countVowels(input, index + 1);
            }
            return countVowels(input, index + 1);
        }

        public static int countConsonants(String input, int index) {
            if (index == input.length()) return 0;

            char current = Character.toLowerCase(input.charAt(index));
            if (!(current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u')) {
                return 1 + countConsonants(input, index + 1);
            }
            return countConsonants(input, index + 1);
        }

        public static void main(String[] args) {
            String input = "THIS IS QSPIDER PLACEMENT DRIVE";
            System.out.println("Number of vowels: " + countVowels(input, 0));
            System.out.println("Number of consonants: " + countConsonants(input, 0));
        }
    }

