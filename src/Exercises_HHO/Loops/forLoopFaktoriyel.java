package Exercises_HHO.Loops;

import java.util.Scanner;

public class forLoopFaktoriyel {
    public static void main(String[] args) {
        /*for (int i = 2; i<100; i *= 2){

            System.out.println("i = " + i);

        }*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int fakt = 1;

        for (int i = 1; i <= sayi; i++) {
            fakt *= i;
        }
        System.out.println("fakt = " + fakt);
    }


}
