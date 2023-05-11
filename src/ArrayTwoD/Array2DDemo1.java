package ArrayTwoD;

public class Array2DDemo1 {
    public static void main(String[] args) {

        int[][]  arr=new int[2][2];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;

        for (int a=0;a<arr.length;a++){

            for (int b=0;b<arr.length;b++){
                System.out.print(arr[a][b]+ "\t");
            }
            System.out.println();
        }


    }
}
