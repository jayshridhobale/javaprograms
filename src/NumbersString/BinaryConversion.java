package NumbersString;

public class BinaryConversion {
    public static void main(String[] args) {
        int no=23;
        int i=0;
        int [] temp=new int [15];
        while (no>0)
        {
            temp[i]=no%2;
            i++;
            no=no/2;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(temp[j]+"\t");
        }
    }
}
