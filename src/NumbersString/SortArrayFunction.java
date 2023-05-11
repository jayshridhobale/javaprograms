package NumbersString;
import java.util.Arrays;
public class SortArrayFunction {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 9, 3};
        Arrays.sort(arr);
        for (int i : arr)
            System.out.print(i);
    }
}
