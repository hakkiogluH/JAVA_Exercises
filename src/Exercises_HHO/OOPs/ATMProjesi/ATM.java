package Exercises_HHO.OOPs.ATMProjesi;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("***********************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("***********************************");


        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş başarılı");
                break;
            } else {
                System.out.println("Giriş başarısız");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı = " + giris_hakki);
                if (giris_hakki == 0) {
                    System.out.println("Giriş hakkınız bitti...");
                    return;
                }
            }
        }

        System.out.println("***********************************");

        String islemler = "1. Bakiye Görüntüleme\n"
                + "2.Para Yatırma\n"
                + "3. Para Çekme\n"
                + "Çıkmak için q'ya basınız.";

        System.out.println(islemler);

        System.out.println("***********************************");


        while (true) {
            System.out.println("İşlemi seçiniz: ");
            String islem = scan.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz = " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraYatir(tutar);

            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
