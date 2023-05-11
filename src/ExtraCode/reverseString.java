package ExtraCode;

public class reverseString {
    public static void main(String[] args) {
        String str="jayshri";
        int str1=str.length();
        String rev="";
        for(int i=str1-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
