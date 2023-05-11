package Important;
//write a java program to print list in descending order
import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(13);
        numbers.add(5);
        numbers.add(63);
        numbers.add(93);

        System.out.println("Original List: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted List in Descending Order: " + numbers);
    }
}
