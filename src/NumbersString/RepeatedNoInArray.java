package NumbersString;

public class RepeatedNoInArray {
    public static void main(String[] args) {
                int[] arr={2,2,1,3,7,9};
                for (int i = 0; i <arr.length ; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            System.out.println("Repeated number is: "+arr[i]);
                        }
                    }


                }
    }
}
