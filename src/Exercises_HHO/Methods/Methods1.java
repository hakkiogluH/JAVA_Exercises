package Exercises_HHO.Methods;

import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        // Yazılan bir metod içine herhangi bir parametre almayabilir.
        // Mesela selamlama() diye metod tanımlayıp, içine gidince sout ile "merhaba" yazdırılabilir.

        faktoriyel();
    }

    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        while (sayi>0){
            faktoriyel *= sayi;
            sayi--;
        }

        System.out.println("faktoriyel = " + faktoriyel);
    }
}
