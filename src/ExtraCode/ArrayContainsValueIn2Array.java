package ExtraCode;

public class ArrayContainsValueIn2Array {
    public static void main(String[] args) {
        int[] arr1={10,2,3,4};
        int [] arr2={11,4,5,21};
        boolean status=false;

        int element=4;
          for(int i=0;i<arr2.length;i++){
            if(arr2[i]==element){
               status=true;
               break;
            }
        }
        if(status){
            System.out.println("element found" +element);
        }
        else {
            System.out.println("not fount");
        }
    }
}
