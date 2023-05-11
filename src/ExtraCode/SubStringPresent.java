package ExtraCode;

public class SubStringPresent {
    public static void main(String[] args) {
        String str1="madam";
        String str2="md";
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        int j = 0;
        int count=0;
        for(int i=0;i<ch1.length;i++){
            if(ch1[0]==ch2[0]){
                if(ch1[i]==ch2[j] && i==j){
                    j++;
                    count++;
                }else {
                    if(ch1[i]==ch2[j]){
                        j++;
                        count++;
                    }
                }
                if(count==ch2.length){
                    break;
                }
            }
        }
        System.out.println("String is"+str1    );
        System.out.println("Substring is Present"+str2);
    }
}
