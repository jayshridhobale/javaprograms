package NumbersString;

public class CountCharacterOccurances {
    public static void main(String[] args) {
        String str="java ia a programming lang";
        char[] arr=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.equals(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
