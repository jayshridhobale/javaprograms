package ExtraCode;

public class SplitString {
    public static void main(String[] args) {
        String str = "this is a java program lang";
        String str2[] = str.split("\\s");  //or String str2[]= str.split(" ");
        for (String s1 : str2) {
            System.out.println(s1);

        }
    }
}

