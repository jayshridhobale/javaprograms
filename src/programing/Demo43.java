package programing;

public class Demo43 {
    public static void main(String[] args) {


        int row = 5;
        int line = 5;
        int num = 0;

        for (int i = 0; i<row; i++) {
            for(int j=0;j<line;j++){
                if(num>=j)
                {
                    System.out.print("*"+"\t");
                }
            }
            num++;
            System.out.println();
        }
    }
}
