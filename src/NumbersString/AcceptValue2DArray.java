package NumbersString;
import java.util.Scanner;
public class AcceptValue2DArray {
    public static void main(String[] args) {
                Scanner sc1=new Scanner(System.in);
                System.out.println("Enter Row value");
                int row=sc1.nextInt();
                System.out.println("Enter column value");
                int col=sc1.nextInt();

                int[][] arr=new int[row][col];
                int[][]temp=new int[row][col];

                System.out.println("Enter matrix value");
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        arr[i][j]=sc1.nextInt();
                        //  temp[i][j]=arr[j][i];
                    }
                }
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        temp[i][j]=arr[j][i];
                    }
                }
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        System.out.print(arr[i][j]+"\t");

                    }
                    System.out.println();
                }
                System.out.println("new arr");
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        System.out.print(temp[i][j]+"\t");

                    }
                    System.out.println();
                }
    }
}
