package programing;

public class Demo59 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        for(int i=1;i<=line;i++)
        {
            for(int j=1;j<=star;j++){
                System.out.print("*"+"\t");
            }
            star--;
            System.out.println();
        }
    }
}
