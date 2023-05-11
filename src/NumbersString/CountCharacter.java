package NumbersString;

public class CountCharacter {
    public static void main(String[] args) {
        String str="NAYAN";
        char [] ch=str.toCharArray();
        int []temp=new int [ch.length];
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                    temp[j]=-1;

                }
                if(temp[i]!=-1)
                {
                    temp[i]=count;
                }

            }


        }
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]+"\t"+temp[i]);
        }

    }
}
