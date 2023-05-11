package SetFramework;
import java.util.HashSet;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> language=new HashSet();
        language.add("Java");
        language.add("Sql");
        language.add("Hibernate");
        language.add("J2EE");
        System.out.println(language);
    }
}
