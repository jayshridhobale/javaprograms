package ExtraCode;

import java.util.HashMap;

public class CountEachWord {
    public static void main(String[] args) {
        String str ="is java java is java";
        HashMap<String, Integer> wordCounter = new HashMap<>();
        for(String s1:str.split(" ")){
            if (wordCounter.containsKey(s1)) {
                wordCounter.put(s1, wordCounter.get(s1) + 1);
            } else {
                wordCounter.put(s1,1);
            }
        }
        System.out.println(wordCounter);
        }





    }