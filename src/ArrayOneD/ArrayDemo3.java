package ArrayOneD;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=12;
        arr[2]=13;
        arr[3]=14;
        arr[4]=15;


        int sum=0;
        for(int a=0;a<arr.length;a++){
            sum=sum+arr[a];

        }
        System.out.println(sum);
        int average=sum/5;
        System.out.println(average);
    }
}
