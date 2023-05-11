package String;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="JAVA";
        System.out.println(s1==s2);

        s1= s2+"J2EE";
        System.out.println(s1==s2);
    }
}
