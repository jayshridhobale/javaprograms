package programing;

public class Demo60 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        for(int i=1;i<=line;i++)
        {
            for(int j=star;j>=1;j--){
                System.out.print("*"+"\t");
            }
            star--;
            System.out.println();
        }
    }
}
