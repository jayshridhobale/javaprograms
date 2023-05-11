package programing;

public class Demo139 {
    public static void main(String[] args) {
        int line=5;
        int star=1;
        char ch='A';


        for(int i=1;i<=line;i++)
        {

            char ch2=ch;
           int num3=2;
            for(int j=1;j<=star;j++)
            {

                   System.out.print(ch2+"\t");
                   ch2=(char)(ch2+num3);
                   num3--;

            }
            ch++;
            star++;
            System.out.println();
        }
    }
}
