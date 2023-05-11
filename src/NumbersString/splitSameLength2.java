package NumbersString;

public class splitSameLength2 {
    public static void main(String[] args) {
        String str="Good_Morning";
        int no=3;
        int data=str.length();
        int ch=data/no;

        for(int i=0;i<str.length();i=i+ch)
        {
            System.out.println(str.substring(i,i+ch));
        }

    }
}
