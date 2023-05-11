package NumbersString;

import java.util.Arrays;

public class FascinatingNo {
    public static void main(String[] args) {
    int no=192;
    int no1=no*2;
    int no2=no*3;
    String str=no+""+no1+no2;
        System.out.println(str);

        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+"\t");
        }
        System.out.println();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+"\t");
        }

        int count=0;
        for(char c='1';c<='9';c++)
        {
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]==c)
                {
                    count++;
                }
            }
        }
        System.out.println();
        if(count==9)
        {
            System.out.println("number is fascinating");
        }
        else {
            System.out.println("number is not fascinating");
        }

    }
}
