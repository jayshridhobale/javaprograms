package NumbersString;

public class counter2 {
    public static void main(String[] args) {
        String a="keep";
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<a.length();j++)
            {
                System.out.println(a.substring(i,j+1));
            }
        }
    }
}
