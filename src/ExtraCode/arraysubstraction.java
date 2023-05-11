package ExtraCode;

public class arraysubstraction {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int[] arr2={5,10,15,20};
        int[] sub=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
           sub[i]=arr1[i]-arr2[i];
        }
        for (int i=0;i<sub.length;i++){
            System.out.println(sub[i]);
        }
    }
}
