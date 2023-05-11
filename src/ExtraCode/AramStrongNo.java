package ExtraCode;

public class AramStrongNo {
    public static void main(String[] args) {
        int no=153;
        int num=no;
        int temp=0,sum=0;
        while(no>0){
            temp=no%10;
            sum=sum+(temp*temp*temp);
            no=no/10;
        }
        if(sum==num){
            System.out.println("the no is armstrong");
        }
        else {
            System.out.println("the no is not armstrong");
        }
    }
}
