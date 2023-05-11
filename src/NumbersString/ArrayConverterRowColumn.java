package NumbersString;

public class ArrayConverterRowColumn {
    public static void main(String[] args) {
        int [][] demo={{1,1,1},{2,2,2},{3,3,3}};
       int temp=0;
        System.out.println("before transpose");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(demo[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("after transposing maxtrixs");

       for(int i=0;i<3;i++)
       {
           for(int j=i+1;j<3;j++)
           {
               temp=demo[i][j];
               demo[i][j]=demo[j][i];
               demo[j][i]=temp;
           }
       }
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(demo[i][j]+" ");
           }
           System.out.println();
       }

    }
}
