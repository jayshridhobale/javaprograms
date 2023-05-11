package programing;

public class Demo34 {

        public static void main(String[] args) {
            int row = 5;
            int line=5;
            int num=1;

            for(int i=0;i<row;i++)
            {

                for(int j=0;j<line;j++)
                {
                    System.out.print(num+"\t");
                    num+=2;

                }

                System.out.println();
            }
        }

}
