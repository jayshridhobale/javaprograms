package ExtraCode;

public class SplitSameLength {
    public static void main(String[] args) {
        String str = "good_morning";
        int no = 3;
        int data = str.length();
        int sum = no / data;
        for (int i = 0; i < str.length();i=i+sum){
            System.out.println(str.substring(i,i+sum));
        }
    }
}
