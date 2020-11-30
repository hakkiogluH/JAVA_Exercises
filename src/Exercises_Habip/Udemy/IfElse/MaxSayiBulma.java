package Exercises_Habip.Udemy.IfElse;

import java.util.Scanner;

public class MaxSayiBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int a = scan.nextInt();
        System.out.print("İkinci sayı: ");
        int b = scan.nextInt();
        System.out.print("Üçüncü sayı: ");
        int c = scan.nextInt();

        int max = 0;

        if (a >= b && a >= c){
            max = a;
        }

        else if (b >= a && b >= c){
            max = b;
        }

        else {
            max = c;
        }

        System.out.println("En büyük sayı: " + max);


    }
}
