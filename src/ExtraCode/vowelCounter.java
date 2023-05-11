package ExtraCode;

public class vowelCounter {
    public static void main(String[] args) {
        String str="java programming language";
        char [] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
