package Exercises_Habip.Udemy.Arrays_Arraylists;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        int [] a = new int[5];

        int [] b = {10, 20, 30, 40, 50};
        System.out.println(b.length);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            a[i] = scanner.nextInt();
        }

        System.out.println("*******************************************");

        for (int i = 0; i < 5; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }

        array_Bastir(b);
        System.out.println(ortalama_Bul(a));
    }


    public static void array_Bastir(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element" + (i+1) + " : " + array[i]);
        }
    }

    public static double ortalama_Bul(int [] arr){
        int toplam = 0;
        double ortalama = 1;
        for (int j : arr) {
            toplam += j;
        }

        ortalama = (double) toplam / arr.length;
        return ortalama;
    }
}
