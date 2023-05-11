package GreenZone;

//      input : 1  2  3
//              4  5  6
//              7  8  9
//     output :1 4 7 8 9 6 3 2 5
public class Matrix3D {
    public static void main(String[] args) {
        int[][] data={{1,2,3},{4,5,6},{7,8,9}};

        int rowStart=0,rowEnd=data.length-1;
        int colStart=0,colEnd=data[0].length-1;

        while (rowStart<rowEnd && colStart< colEnd){
            for(int i=colStart;i<=colEnd;i++) {
                System.out.print(data[i][colStart] + " ");
            }
            colStart++;
            if(rowEnd==2){
                for(int i=colStart;i<=colEnd;i++){
                    System.out.print(data[2][i]+" ");
                }
                rowEnd--;
            }
            for(int j=rowEnd;j>=0;j--){
                System.out.print(data[j][colEnd]+" ");
            }
            colEnd--;

            for(int m=rowStart;m<=rowEnd;m++){
                System.out.print(data[m][1]+" ");
            }
            rowEnd--;
        }
    }
}
