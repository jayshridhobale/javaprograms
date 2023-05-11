package SetFramework;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> language=new LinkedHashSet<>();
        language.add("Java");
        language.add("Sql");
        language.add("Hibernate");
        language.add("J2EE");
        System.out.println(language);
    }
}
