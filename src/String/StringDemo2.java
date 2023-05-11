package String;

public class StringDemo2 {
    public static void main(String[] args) {
        //Constant pool area
        String s1 = "JAVA";
        String s2 = "SQL";
        String s3 = "JAVA";

        //Non-constant pool area
        String str1 = new String("SQL");
        String str2 = new String("SQL");
        String str3 = new String("Java");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==str1);
        System.out.println(str1==str2);
        System.out.println(s2.equals(str1));
        System.out.println(s3.equals(str3));
        System.out.println(s3.equalsIgnoreCase(str3));

    }

}
