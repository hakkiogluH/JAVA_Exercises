package Exercises_HHO.Loops;

import java.util.Scanner;

public class While_KullaniciGirisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String userID = "Ceyhun Atuf";
        String password = "12345";

        System.out.println("************************************");
        System.out.println("Kullanıcı girişine hoşgeldiniz..");
        System.out.println("************************************");


        while (true){
            System.out.print("Kullanıcı adı: ");
            String user = scanner.nextLine();
            System.out.print("Şifre: ");
            String sifre = scanner.nextLine();

            if(user.equalsIgnoreCase(userID) && sifre.equals(password)){
                System.out.println("Hoşgeldin " + userID);
            }
            else if (user.equalsIgnoreCase(userID) && !sifre.equals(password)){
                System.out.println("Girilen şifre yanlış.");
                giris_hakki -= 1;
            }
            else if (!userID.equalsIgnoreCase(user) && sifre.equals(password)){
                System.out.println("Girilen kullanıcı adı yanlış.");
                giris_hakki -= 1;
            }
            else {
                System.out.println("Kullanıcı adınız ve şifreniz yanlış.");
                giris_hakki -= 1;
            }

            if (giris_hakki == 0){
                System.out.println("Giriş hakkınız bitti. Tekrar bekleriz.");
                break;
            }
        }

    }
}
