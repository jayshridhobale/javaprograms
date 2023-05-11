package programing;

public class Demo136 {
    public static void main(String[] args) {
        int line = 5;
        int space = 5;
        char alp='A';
        for (int i = 1; i <= line; i++) {
            char alp2=alp;
            char alp3=5;
            for (int j = 1; j <= space; j++) {

                System.out.print(alp2+"\t");
                alp2=(char) (alp2+alp3);  //  or  alp2+=alp3;
            }
            alp++;
            System.out.println();

        }

    }
}
