package NumbersString;

public class Missingelement {
    public static void main(String[] args) {
        int [] arr={1,3,2,5};
        int [] temp=new int [arr.length+1];


        for(int i=0;i<temp.length;i++)
        {
            temp[i]=0;

        }
        for(int i=0;i<arr.length;i++)
        {
            temp[arr[i]-1]=1;
        }
        int output=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==0)
            {
                output=i+1;
            }
        }
        System.out.println("missing element is "+output);
    }
}
