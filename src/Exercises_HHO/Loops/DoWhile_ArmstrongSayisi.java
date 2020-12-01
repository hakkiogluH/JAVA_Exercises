package Exercises_HHO.Loops;

import java.util.Scanner;

public class DoWhile_ArmstrongSayisi {
    public static void main(String[] args) {
        /*
        Armstrong sayısı: Rakamlarının üssünü alacaksın ve bunları toplayacaksın. Üs = basamak sayısı olacak.
        Toplam asıl sayıya eşit olursa armstrong sayısı oluyor.
        1634 = 1^4 + 6^4 + 3^4 + 4^4
        371  = 3^3 + 7^3 + 1^3 
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sayi = scan.nextInt();


        int length = 0;
        int temp1 = sayi;
        int temp2 = sayi;                        // Aşağıda sayi değişkenini birçok kez değiştireceğim için geçici iki adet temp
        int birler;                          // değişkeni atayıp onları değiştirdim. Sondaki kontrolde bana sayının kendisi lazım.
        double sum = 0;


        while (temp1 > 0) {
            length += 1;
            temp1 /= 10;
        }

        do {
            birler = temp2 % 10;
            temp2 /= 10;

            sum += Math.pow(birler, length);

        } while (temp2 > 0);


        if (sayi == sum) {
            System.out.print("This number is an Amstrong number.");
        } else {
            System.out.println("This number is not an Amstrong number.");
        }

    }
}
