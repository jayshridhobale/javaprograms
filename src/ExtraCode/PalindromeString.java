package ExtraCode;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "mam";
        int str2 = str.length();
        String rev = "";
        for (int i = str2 - 1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("string is palindrome");
        }
        else {
            System.out.println("string is not palindrome");
        }
    }
}