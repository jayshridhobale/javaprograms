package ArrayOneD;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        printArray(arr);
        ArrayDemo7 a1=new ArrayDemo7();
        a1.display(arr);

    }
    static void printArray(int[] arr1) {
        for (int a = 0; a < 5; a++) {
            System.out.println(arr1[a]);


        }
    }
           void display(int[] arr2) {                //Non-Static Method
               for(int a=0;a<5;a++){
                   System.out.println(arr2[a]);


        }

    }
}
