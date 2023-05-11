package ExtraCode;
import java.util.*;
public class CharacterOccurances {
    public static void main(String[] args) {
    String str = "pooja";
    char[] charlist = str.toCharArray();
    Map<Character, Integer> mapCounter = new HashMap();
        for(char ch :charlist) {
        if (mapCounter.containsKey(ch)) {
            mapCounter.put(ch, mapCounter.get(ch) + 1);
        } else {
            mapCounter.put(ch, 1);
            }
        }
            System.out.println(mapCounter);
    }
}