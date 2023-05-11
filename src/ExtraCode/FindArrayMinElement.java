package ExtraCode;

public class FindArrayMinElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 65, 7, 1, 2, 80};
        int min = arr[0];
        for (int i = 0; i < arr.length;i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
