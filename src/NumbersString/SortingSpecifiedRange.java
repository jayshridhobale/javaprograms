package NumbersString;

import java.util.Arrays;
//sorting specified range of character only range 3-8 using java?
//input array={'A','S','I','i','r','z','Y',k','G','j','b'}   Output array={'A','S','I','Y','i','k','r',z','G','j','b'} ?

public class SortingSpecifiedRange {
    public static void main(String[] args) {
        char[] characters = {'A', 'S', 'I', 'i', 'R', 'z', 'Y', 'k', 'G', 'j', 'b'};
        Arrays.sort(characters, 3, 8);
        System.out.println(Arrays.toString(characters));
    }

}
