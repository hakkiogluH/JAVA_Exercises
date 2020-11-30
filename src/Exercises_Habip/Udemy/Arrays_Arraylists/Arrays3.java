package Exercises_Habip.Udemy.Arrays_Arraylists;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {

    public static int [] arrayi_doldur(int uzunluk){
        Scanner scan = new Scanner(System.in);
        int [] cikti = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++){
            cikti[i] = scan.nextInt();
        }
        return cikti;
    }

    public static void arrayi_Bastir(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + (i+1) + ": "+ array[i]);
        }
    }

    public static void main(String[] args) {

        //int [] arr = arrayi_doldur(5);
        //arrayi_Bastir(arr);
        //benim_bildigim_Yontem_Bastir(arrayi_doldur(5));
        array_sirala(arrayi_doldur(6));


    }

    public static void benim_bildigim_Yontem_Bastir(int [] array){
        System.out.println(Arrays.toString(array));
    }

    public static void array_sirala(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
