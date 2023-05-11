package String;

public class OccuranceProgram {

    public static void main(String[] args) {

        String metals = "abcgobaldlogad";

        String str= "gold";


        for (int i=0;i<str.length();i++)
        {

            int count =0;

            for (int j=0;j<metals.length();j++)
            {
                if (str.charAt(i) == metals.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i)+" : "+count);
        }



    }
}
