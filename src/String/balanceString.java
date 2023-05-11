package String;

public class balanceString {

    public static void main(String[] args) {

        String str = "QJQQJJQJJ";
        int a=0;
        int count=0;

        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='Q')
                a++;
            else
                a--;
            if (a==0)
                count++;
        }
        System.out.println("count: "+count);
    }
}