package NumbersString;

public class DecimalToBinary {
    public static void main(String[] args) {
    int [] arr=new int [10];
    int a=15;
    int i=0;
            while (a!=0){
        int r=a%2;
        arr[i]=r;
        i++;
        a/=2;
    }
            for(int p=i-1;p>=0;p--){   //p=i-1---->used to remove unwanted 0 at printing
        System.out.print(arr[p]);

    }
}
}
