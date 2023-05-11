package Array3D;

public class Array3DDemo1 {
    public static void main(String[] args) {
        int[][][] data= new int[2][2][2];

        //1st row
        data[0][0][0] = 10;
        data[0][0][1] = 20;
        data[0][1][0] = 30;
        data[0][1][1] = 40;

        //2nd row
        data[1][0][0] = 50;
        data[1][0][1] = 60;
        data[1][1][0] = 70;
        data[1][1][1] = 80;

        //rows
        for(int i=0; i<data.length; i++) {
            //columns
            for(int j=0; j<data.length; j++) {
                //panels
                for(int k=0; k<data.length; k++) {
                    System.out.print(data[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }

}
