package Exercises_HHO.Loops;

import java.util.Scanner;

public class DoWhile_RakamlarToplami {
    public static void main(String[] args) {
        //doWhile loop da ilk seferde koşul kontrol edilmezi onun için kesinlikle 1 kez çalışır. Koşul sağlanmasa bile
        // girilen bir sayının rakamları toplamını bulma

        Scanner scanner = new Scanner(System.in);
        System.out.print("Herhangi bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int sum = 0;

        do {
            sum += sayi % 10;
            sayi /= 10;

            System.out.println("Sayı = " + sayi);


        } while (sayi > 0);

        System.out.println("sum = " + sum);

    }
}
