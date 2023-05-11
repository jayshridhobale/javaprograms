package NumbersString;

import java.util.Scanner;

public class D2ArrayAddition {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter no of rows");
        int row=sc1.nextInt();
        System.out.println("enter no of columns");
        int clo=sc1.nextInt();
        int [][] firstArray=new int[row][clo];
        int [][] secondArray=new int[row][clo];
        int[][] addition = new int[row][clo];

        for(int i=0 ;i<row;i++)
        {
            for(int j=0; j<clo;j++)
            {
                System.out.println("enter element of first matrix");
                firstArray[i][j]=sc1.nextInt();
            }
        }
        for(int i=0 ;i<row;i++)
        {
            for(int j=0; j<clo;j++)
            {
                System.out.println("enter element of second matrix");
               secondArray[i][j]=sc1.nextInt();
            }
        }
        for(int i=0 ;i<row;i++)
        {
            for(int j=0; j<clo;j++)
            {
                addition[i][j]=firstArray[i][j]+secondArray[i][j];
            }
        }


        for(int i=0 ;i<row;i++)
        {
            for(int j=0; j<clo;j++)
            {
                System.out.print(addition[i][j]+" ");

            }
            System.out.println();
        }



    }
}
