package ExtraCode;

public class PalindromeNo {
    public static void main(String[] args) {
        int no=121;
        int num=no;
        int rev=0,rem=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(no==rev){
            System.out.println("no is palindrome");
        }
        else {
            System.out.println("no is not palindrome");
        }
    }
}
