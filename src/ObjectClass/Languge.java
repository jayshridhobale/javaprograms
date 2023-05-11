package ObjectClass;

public class Languge {
    public static void main(String[] args) {
        String str1 =new String( "java");
        String str2 = new String( "java");
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1==str2);     //false
        System.out.println(str1.hashCode()== str2.hashCode()); //true
        String str3=new String("Manual");
        System.out.println(str1.hashCode()==str3.hashCode()); //false
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str1.getClass());


    }
}