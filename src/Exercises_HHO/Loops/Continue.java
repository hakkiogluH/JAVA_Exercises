package Exercises_HHO.Loops;

public class Continue {
    public static void main(String[] args) {
        /*int i = 0;

        for (; i<10; i++){
            if (i == 3 || i == 5){
                continue;
            }
            System.out.println("i = " + i);   // i'nin 3 ve 5 harici değerlerini yazdırır.
        }

         */

        int i = 0;

        while (i<10){
            if (i == 3 || i == 5){
                continue;
            }
            System.out.println("i = " + i);
            i++;                              // Bu döngü sonsuz döngüye girer. Çünkü i=3 okuyunca duruyor ve başa dönuyor ama i'yi artımıyor.
                                              // i'yi artırabilmesi için aşağıya inmesi lazımdı.
                                              // Artıramadığı için i=3 değerinde takılı kalıyor.
                                              // Bunu aşmak için continue'nun hemen üzerine bir tane daha i++ yap.
                                              // Bu durum for döngüsünde olmuyor, çünkü for zaten otomatik olarak kendisi artırıyor.
        }
    }
}
