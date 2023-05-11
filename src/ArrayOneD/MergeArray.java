package ArrayOneD;

public class MergeArray {

    public static void main(String[] args) {


        int[] arr1={10,20,30,40};
        int [] arr2={50,60,70,80};

        int[] result=new int[arr1.length+arr2.length];
            int count=0;
        for(int a=0;a<arr1.length;a++){
            result[a]=arr1[a];
            count++;
        }
        for(int a=0;a<arr2.length;a++){
            result[count++]=arr2[a];

        }
        for(int a=0;a<result.length;a++) {
            System.out.println(result[a]);
        }


//         int[] arr1={10,20,30,40};
//        int [] arr2={50,60,70,80};
//
//        int[] result=new int[arr1.length+arr2.length];
//
//        for(int a=0;a<arr1.length;a++){
//            result[a]=arr1[a];
//        }
//        for(int a=0;a<arr2.length;a++){
//            result[arr1.length+a]=arr2[a];
//
//        }
//        for(int a=0;a<result.length;a++) {
//            System.out.println(result[a]);
//        }
    }
}
