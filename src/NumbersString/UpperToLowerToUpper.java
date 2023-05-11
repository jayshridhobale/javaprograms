package NumbersString;

public class UpperToLowerToUpper {
    public static void main(String[] args) {
        String str="Good MORNING";
        String temp=" ";
        String str2=" ";

        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                str2=str2+Character.toUpperCase(str.charAt(i));
            }
            else {
                str2=str2+Character.toLowerCase(str.charAt(i));

        }
        }
        System.out.println(str2);
    }
}
