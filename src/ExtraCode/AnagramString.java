package ExtraCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1="Peek";
        String str2="Keep";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] ch1= str1.toCharArray();
            char[] ch2=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean status=Arrays.equals(ch1,ch2);
            if(status){
                System.out.println("String is anagram");
            }
            else {
                System.out.println("String is not anagram");
            }
        }
    }
}
