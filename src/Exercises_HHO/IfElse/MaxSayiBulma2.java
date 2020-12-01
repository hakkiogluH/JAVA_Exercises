package Exercises_HHO.IfElse;

import java.util.Scanner;

public class MaxSayiBulma2 {
    public static void main(String[] args) {

        int count = 0;
        int max = 0;

        while(count < 10){

            Scanner scan = new Scanner(System.in);

            System.out.print("Sayı giriniz: ");
            int sayi = scan.nextInt();

            if (max <= sayi) max = sayi;

            count++;
        }

        System.out.println("En büyük sayı: " + max);
    }
}
