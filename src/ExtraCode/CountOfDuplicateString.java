package ExtraCode;

public class CountOfDuplicateString {
    public static void main(String[] args) {
        String str="java is java";
        String[] str2=str.split(" ");
        int count=1;
        for(int i=0;i<str2.length;i++){
            for(int j=i+1;j<str2.length;j++){
                if(str2[i].equals(str2[j])){
                count++;
            }
        }if(count>1) {
                System.out.println("Count is:\t"+count);
                break;

            }
        }
    }
}
