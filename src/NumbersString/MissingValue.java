package NumbersString;

public class MissingValue {
    public static void main(String[] args) {
        int[] arr = {2,1, 3, 4, 6, 7, 8, 9};
        int n=arr.length;

        int sum=((n+1)*(n+2))/2;
        for(int a:arr)
            sum-=a;
        System.out.println(sum);
    }

}
