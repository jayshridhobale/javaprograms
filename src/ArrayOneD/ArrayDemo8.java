package ArrayOneD;

public class ArrayDemo8 {
    public static void main(String[] args) {

        int[] result=display();
        for(int a=0;a<result.length;a++){
            System.out.println(result[a]);

        }

    }
    static int[] display(){
        int[] arr={10,20,30,40};
        return arr;
    }
}