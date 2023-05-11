package ExtraCode;

public class StrongNo {
    public static void main(String[] args) {
        int no=145;
        int num=no;
        int temp=0;int sum=0;
        while (no>0){
            temp=no%10;
            int fact=1;
            for(int i=1;i<=temp;i++) {
               fact=fact*i;
            }
             sum += fact;
                no=no/10;
            }
            if(sum==num){
                System.out.println("strong no");
            }
            else {
                System.out.println("No is not strong");
            }
        }
    }

