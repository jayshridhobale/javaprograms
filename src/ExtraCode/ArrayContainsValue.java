package ExtraCode;

public class ArrayContainsValue {
    public static void main(String[] args) {
        int[] arr={10,2,3,5};
        boolean status=false;
        int find=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                status=true;

            }
        }
        if(status){
            System.out.println("find is "+find);
        }
        else {
            System.out.println("not found "+find);
        }
    }
}
