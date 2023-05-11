package NumbersString;

public class CountnoofVowels {
    public static void main(String[] args) {
        String str="java is a programing language";
        char [] arr= str.toCharArray();
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            System.out.println(arr[i]);

            if (arr[i] == 'a' || arr[i] == 'e' || arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
                count++;

            }

        }
        System.out.println(count);


    }
}
