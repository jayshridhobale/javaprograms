package String;

public class FirstLetterCapital {

    public static void main(String[] args) {

        String ans ="";
        String str="this is programming batch";
        String[]arr=str.split(" ");
        for (String s: arr)
        {
            String temp = s.toUpperCase();
            ans+=temp.charAt(0)+s.substring(1)+" ";

        }
        ans=ans.trim();

        System.out.println(ans+'.');

    }
}
