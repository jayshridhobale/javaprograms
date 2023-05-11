package ExtraCode;

public class ReverseStringByWord {
    public static void main(String[] args) {
        String str="Qspider Hadpsar";
        String rev="";
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            rev+=arr[i]+" ";
        } 
        rev=rev.trim();
        System.out.println(rev);
        System.out.println(rev.length());
    }
}
