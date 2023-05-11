package ExtraCode;
public class ReverseEachWord {
    public static void main(String[] args) {
        String str="java is a programming language";
        String[] str2=str.split(" ");
        String revstr="";

        for(int i=0;i<str2.length;i++){
            String word=str2[i];
            String revWord="";

            for(int j=word.length()-1;j>=0;j--){
               revWord=revWord+word.charAt(j);
            }
            revstr=revWord+" ";
            System.out.print(revstr);
        }
    }
}
