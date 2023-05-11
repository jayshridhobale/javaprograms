package NumbersString;

import java.util.Arrays;

public class FascinatingNo2 {
    public static void main(String[] args) {


        int no1 = 192;
        int no2 = 192 * 2;
        int no3 = 192 * 3;
        String data = no1 + "" + no2 + no3;
        char [] ch=data.toCharArray();
        Arrays.sort(ch);
        char[] ch2={'1','2','3','4','5','6','7','8','9'};
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==ch2[i])
            {
               count++;
            }
        }
        if(count==9)
        {
            System.out.println("fascinating number");
        }
        else {
            System.out.println("not fascinating number");
        }
    }
}
