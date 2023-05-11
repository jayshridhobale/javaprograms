package ExtraCode;

import java.util.Scanner;

public class CubeOfNumberWithoutUsingAsterisk {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=s1.nextInt();
        int cube=num+num+num+num+num+num+num+num
                +num+num+num+num+num+num+num+num
                +num+num+num+num+num+num+num+num+num;
        System.out.println("the cube of"+"\t"+num+"is"+"\t"+cube);
    }
}
