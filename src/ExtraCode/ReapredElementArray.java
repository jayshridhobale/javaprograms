package ExtraCode;

public class ReapredElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 5, 6, 8, 7};
        for (int i = 0; i < arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.print(arr[j]);

            }
        }
    }
}
