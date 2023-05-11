package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterOccurances {
    public static void main(String[] args) {
//        String str = "jayshrij";
//       char[] ch=str.toCharArray();
//       int j=0;
//       for(char mychar:ch) {
//           if (mychar=='j') {
//               j++;
//               System.out.println(mychar);
//           }
//       }
//        System.out.println(j);
//    }
//}
        String str = "pooja";
        char[] charList = str.toCharArray();
        Map<Character,Integer> mapCounter=new HashMap();
        for (char ch : charList) {
            if(mapCounter.containsKey(ch)){
                mapCounter.put(ch,mapCounter.get(ch)+1);
            }
            else {
                mapCounter.put(ch,1);
            }
        }
        System.out.println(mapCounter);
    }
}