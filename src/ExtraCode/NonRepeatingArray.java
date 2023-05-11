package ExtraCode;

public class NonRepeatingArray {
    public static void main(String[] args) {
        int[] arr={10,20,31,20};
        for(int i=0;i<arr.length;i++){
            boolean status=true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    status=false;
                }

            }if(status){
                System.out.println(arr[i]);

            }


        }
    }
}
