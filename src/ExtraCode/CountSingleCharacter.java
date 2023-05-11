package ExtraCode;

public class CountSingleCharacter {
    public static void main(String[] args) {
        String str = "jayshrij";
        char[] ch=str.toCharArray();
        int j=0;
        for(char mychar:ch) {
            if (mychar=='j') {
                j++;
                System.out.println(mychar);
            }
        }
        System.out.println(j);
    }
}
