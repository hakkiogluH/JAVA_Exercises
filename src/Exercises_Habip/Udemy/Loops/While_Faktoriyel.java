package Exercises_Habip.Udemy.Loops;

import java.util.Scanner;

public class While_Faktoriyel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        int faktoriyel = 1;

        while (sayi > 0) {
            faktoriyel *= sayi;

            sayi--;
        }

        System.out.println("faktoriyel = " + faktoriyel);
    }
}
