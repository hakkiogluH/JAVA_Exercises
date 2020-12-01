package Exercises_HHO.Loops;

import java.util.Scanner;

public class While_ATMProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;

        String islemler = "1. İşlem : Bakiye Öğrenme\n"
                +"2. İşlem : Para Çekme\n"
                + "3. İşlem : Para Yatırma\n"
                + "Çıkış için q'ya basın\n";

        System.out.println("*****************************************");
        System.out.print(islemler);
        System.out.println("*****************************************");


        while (true){
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor.....");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz = " + bakiye);
            }
            else if(islem.equals("2")){
                System.out.print("Çekmek istediğiniz tutar = ");
                int tutar = scanner.nextInt();                           // Buraya dikkat. scannerla string sonrası int alınınca sıkıntı çıkıyor.
                scanner.nextLine();                                      // scanner.nextLine(); girersen düzeliyor.

                if (bakiye - tutar < 0){
                    System.out.println("Yeterli bakiye yok. Bakiyeniz = " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz = " + bakiye);
                }
            }
            else if(islem.equals("3")){

                System.out.print("Yatırmak istediğiniz tutar = ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;

                System.out.println("Yeni bakiyeniz = " + bakiye);

            }
            else{
                System.out.println("Geçersiz işlem");
            }
        }

    }
}
