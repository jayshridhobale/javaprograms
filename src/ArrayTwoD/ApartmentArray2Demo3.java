package ArrayTwoD;

import java.util.Scanner;

public class ApartmentArray2Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Accept total no of floors and flats
        System.out.print("Enter total no of floors : ");
        int floors = sc.nextInt();
        System.out.print("Enter total no of flats : ");
        int flats= sc.nextInt();

        //Declare array
        int[][] apartments = new int[floors][flats];

        //Accept flat nos from user
        System.out.println("Enter " + (floors*flats) + " flat nos. : ");

        //rows ---> floors
        for(int i=0; i<floors; i++) {
            //column ---> flats
            for(int j=0; j<flats; j++) {
                apartments[i][j] = sc.nextInt();
            }
        }

        //Print array
        for(int i=0; i<floors; i++) {
            System.out.println("Floor no : " + (i+1));
            for(int j=0; j<flats; j++) {
                System.out.println("Flat no :" + apartments[i][j] + " ");
            }
            System.out.println();
        }
    }
}
