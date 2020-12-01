package Exercises_HHO.OOPs.OOPs_2_Constructor;

public class Test {
    public static void main(String[] args) {

        Account account1 = new Account();                               // Sadece bu satırı çalıştırırsak diğer sayfadaki kendi yazdığımız constructor yazısı gelir.

        /*account1.setHesapNo("1234567");
        account1.setBakiye(1000.0);
        account1.setIsim("Ahmet Kamil");
        account1.seteMail("coskun.murat@gmail.com");
        account1.setTelefonNo("654653728");

        System.out.println("Bakiye = " + account1.getBakiye());               // Bunu yapmakçok uzun gelirse Constructor kullanmalıyız.
                                                                              // Yani yapıcı fonksiyonlar. Diğer sayfada public Account ile  başlayan kısım
        */

        Account account2 = new Account("1234567", 1000.0, "Ahmet Kamil", "coskun.murat@gmail.com", "654653728");

        account2.paraYatir(500);
        account2.paraCekme(2000);

        Account account3 = new Account();
        System.out.println(account3.geteMail());

        Account account4 = new Account("Ahmet Can", "example@gmail.com", "98776865658");
        System.out.println(account4.geteMail());
        System.out.println(account4.getBakiye());
        System.out.println(account4.getHesapNo());
        System.out.println(account4.getIsim());


        account2.bilgileriGoster();

    }
}
