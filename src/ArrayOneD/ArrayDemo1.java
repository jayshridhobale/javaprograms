package ArrayOneD;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //declaration
        int[] data;
        //size allocation
        data= new int[10];
        //initialization
        data[0]=40;
        data[1]=20;
        data[2]=70;
        data[3]=30;
        data[4]=90;



        //print data
        for(int a=0; a<5; a++) {
            System.out.println(data[a]);
        }


    }
}
