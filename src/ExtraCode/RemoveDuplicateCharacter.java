package ExtraCode;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
    String str="programming";
    char[] ch=str.toCharArray();
    StringBuilder sb1=new StringBuilder();
    for(int i=0;i<ch.length;i++){
        boolean repeat=false;
        for(int j=i+1;j<ch.length;j++){
            if(ch[i]==ch[j]){
                repeat=true;
            }
        }
        if (!repeat){
            sb1.append(ch[i]);
        }
        System.out.println(sb1);
        }
    }
}
