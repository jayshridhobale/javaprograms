package String;

public class Program1 {
    public static void main(String[] args) {

        String s1="PROGRAMMING";
        String s="";

        char[]ch=s1.toCharArray();

        for (int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }
        System.out.println();

        for (int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]+" ");
        }

    }
}
