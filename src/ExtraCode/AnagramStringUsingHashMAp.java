package ExtraCode;

import java.util.HashMap;
import java.util.Map;

public class AnagramStringUsingHashMAp {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Map<Character, Integer> counter = new HashMap<>();
        if (str1.length() != str2.length()) {
            System.out.println("not anagram");
            System.exit(0);
        }
        for (char ch1new : ch1) {
            if (counter.containsKey(ch1new)) {
                counter.put(ch1new, counter.get(ch1new) + 1);
            } else {
                counter.put(ch1new, 1);
            }
            System.out.println(counter);
        }
        for (char ch2new : ch2) {
            if (counter.containsKey(ch2new)) {
                if (counter.get(ch2new) == 1) {
                    counter.remove(ch2new);
                } else {
                    counter.put(ch2new, counter.get(ch2new) - 1);
                }
                System.out.println(counter);
            } else {
                System.out.println("not Anagram");
                System.exit(0);
            }
        }
        if (counter.size()==0){
            System.out.println("It is an Anagram");
        }else {
            System.out.println("not Anagram");
            }
        }
    }


