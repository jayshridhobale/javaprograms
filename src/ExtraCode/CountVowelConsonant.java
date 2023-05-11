package ExtraCode;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String str="pooja";
        int vowels=0; int consonat=0;
        for(int i=0;i<str.length();i++) {
            char[] ch = str.toCharArray();
            if (ch[i] == 'a' || ch [i]== 'e' || ch[i] == 'i' || ch[i]== 'o' || ch[i] == 'u')
                vowels++;
            else
                consonat++;
        }
        System.out.println("vowels Count is \t"+vowels);
        System.out.println("Consonant count is \t"+consonat);
    }
}
