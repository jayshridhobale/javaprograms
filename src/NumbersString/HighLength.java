package NumbersString;

public class HighLength {
    public static void main(String[] args) {
        String str = "java is a programming language";
        String[] temp = str.split(" ");
        int maxlength=0;
        String data="";
        for (int i = 0; i < temp.length; i++)
        {
          if(maxlength<temp[i].length())
          {
              maxlength=temp[i].length();
              data=temp[i];
          }

        }
        System.out.println(maxlength);
        System.out.println(data);
    }
}
