package NumbersString;

public class CommonArray2D {
    public static void main(String[] args) {
        int [] arr1={10,20,50,30,40,80};
        int [] arr2={20,50,45,15,35,80};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println("common between is "+arr2[j]);
                }
            }
        }

    }
}
