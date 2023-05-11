package ExtraCode;

public class CompareWordWithoutUsingInbuiltFun {
    public static void main(String[] args) {
        String str1="jayu";
        String  str2="jayu";
        boolean isCompare=true;
        for(int i=0;i<str1.length();i++){
                if (str1.charAt(i) != str2.charAt(i)) {
                    isCompare = false;
                }

            isCompare=true;
        }
        System.out.println("the Given string equals");

    }
}
