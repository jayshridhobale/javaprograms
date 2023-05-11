package String;

public class RearrangeString {
    public static void main(String[] args) {

        String str = "3Programming 1This 4Batch 2is";
        String []starr= str.split(" ");
        String[] arr=new String[starr.length];
        for (String s: starr)
        {
            char ch =s.charAt(0);
            String s1=s.replace(ch+"","");
            System.out.println(ch);
            int i=Integer.parseInt(ch+"");
            arr[i-1]=s1;
        }
        String ans = "";
        for (String a: arr)
            ans+=a+" ";
        ans=ans.trim();
        System.out.println(ans+'.');
    }
}
