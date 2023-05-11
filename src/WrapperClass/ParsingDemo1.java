package WrapperClass;

public class ParsingDemo1 {
    public static void main(String[] args) {
        String str1="100";
        String str2="200";
        System.out.println(str1+str2); //100200
        //converting String  into primitive format
        int no1=Integer.parseInt(str1);
        int no2=Integer.parseInt(str2);
        System.out.println(no1+no2); //300

        double d1=25.12;
        double d2=50.34;
        System.out.println(d1+d2);
        //converting primitive  into String  format
        String str3=Double.toString(d1);
        String str4=Double.toString(d2);
        System.out.println(str3+str4);
    }
}
