package Exercises_Habip.Udemy.Arrays_Arraylists;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        int [][] array = new int[2][2];

        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println(array[1][1]);


        System.out.println("**********************************************");


        // Diğer bir tanımlama yöntemi:

        int [][] array2 = {{7, 10}, {3,11}};

        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("**********************************************");


        int [][] array3 = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3; j++){

                System.out.print("Array değeri giriniz: ");
                array3 [i][j] = scanner.nextInt();
            }
        }

        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}
