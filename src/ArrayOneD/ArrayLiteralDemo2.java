package ArrayOneD;

public class ArrayLiteralDemo2 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50};
        int[] arr2={100,200,300,400,500};

       int[] result=new int[arr1.length];
       for(int a=0;a<arr1.length;a++){
           result[a]=arr1[a]+arr2[a];
           System.out.println(result[a]);
        }
    }
}
