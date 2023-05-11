package ExtraCode;

public class MissingValueArray {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,6,7,9,8};
        int n=arr.length;
        int num=(n+1)*(n+2)/2;
        for (int d:arr){
            num-=d;
        }
        System.out.println(num);
    }

}
