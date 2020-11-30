package Exercises_Habip.Udemy.Loops;

import java.util.Scanner;

public class break1 {
    public static void main(String[] args) {
        //break sadece içinde bulunduğu döngüyü sonlandırır.

        /*int i = 0;

        while (i < 20) {
            if (i == 10) {  // i = 10 olana kadar döngüye hiç girmiyor. 10 olunca giriyor ve 10'u da yazdırmadan duruyor.
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        */

        Scanner sc = new Scanner(System.in);

        while (true) {
            int islem = sc.nextInt();

            if (islem == -1) {
                System.out.println("Döngüden çıkılıyor...");
                break;
            }

            System.out.println("islem = " + islem);
        }
    }
}
