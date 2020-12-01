package Exercises_HHO.Arrays_Arraylists;

import java.util.Arrays;

public class Arrays4_Onemli {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6};
        int [] b = {1,2,3,4,5,6};

        if ( a == b){
            System.out.println("İki dizi eşittir.");
        }
        else
        {
            System.out.println("İki dizi eşit değildir.");
        }                                                  // İki dizi eşit değildir çıkıyor cevap. Çünkü hafızada bu arraylere ayrılan
                                                           // yerler aynı değil. Denktirler ama eşit değillerdir diyebiliriz belki

        
        if (Arrays.equals(a,b)) System.out.println("Eşitler");
        else System.out.println("Eşit değiller.");

    }
}
