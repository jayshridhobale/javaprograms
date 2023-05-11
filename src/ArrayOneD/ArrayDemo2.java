package ArrayOneD;

public class ArrayDemo2 {

    public static void main(String[] args) {
        double[] data=new double[5];
        data[1]=40;
        data[3]=70;

        for(int a=0; a<=4; a++) {
            System.out.println(data[a] + " ");
        }
        System.out.println();
        System.out.println("==============");
        for(int a=4; a>=0; a--) {
            System.out.println(data[a] + " ");
        }
    }
}
