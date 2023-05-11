package StringFunction;

public class StringFunction1 {
    public static void main(String[] args) {
        String str = "Core Java";

        System.out.println("LENGTH : " +str.length());
        System.out.println("CHAR AT : "+ str.charAt(7));
        System.out.println("INDEX OF : "+ str.indexOf('a'));
        System.out.println("LAST INDEX OF : "+ str.lastIndexOf('a'));
        System.out.println("CONTAINS : "+ str.contains("re"));
        System.out.println("START WITH : "+ str.startsWith("C"));
        System.out.println("START WITH : "+ str.startsWith("c"));
        System.out.println("ENDS WITH : "+ str.endsWith("va"));
        System.out.println("SUB STRING : "+ str.substring(5));
        System.out.println("SUB STRING : "+ str.substring(0, 4));
        System.out.println("UPPER CASE : "+ str.toUpperCase());
        System.out.println("LOWER CASE : "+ str.toLowerCase());
    }
}
