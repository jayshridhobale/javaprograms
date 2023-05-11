package NumbersString;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="Keep";
        String str2="Peek";
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        if(str1.length()==str2.length())
        {
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean status=Arrays.equals(ch1,ch2);
            if(status)
            {
                System.out.println("given string is anagram");
            }
            else {
                System.out.println("not a anagram");
            }
        }
    }
}
