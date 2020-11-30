package Exercises_Habip.Udemy.OOPs.OOPs_2_Constructor;

public class Main {

    public static void main(String[] args) {

        Account account5 = new Account("Mustafa", "example@gmail.com", "087678657654");  //Bellekte bir tane obje oluştu.

        // 1. Adım: Önce Account sınıfını oluşturduk. (Burada Account objelerinin özellikleri ve metodları bulunuyor
        // 2. Adım: Account objesi oluşturuyoruz. new Account..... ile
        // 3. Adım: new Account() ifadesi bize Account classından bir referans çıktısı veriyor. Biz de bu çıktıyı bir referansa eşitliyoruz.

        Account account6 = account5;  // referans oluşturmadık. bunun yerine account5 in referansını kullanıyoruz. account5 in aynısı oluyor.

        if (account5 == account6) System.out.println("Aynı objeyi gösteriyorlar.");

        Account account7 = new Account();

        if (account5 == account7) System.out.println("Aynı objeyi gösteriyorlar.");
        else
            System.out.println("Aynı objeyi göstermiyorlar. Farklı gösteriyorlar");

        new Account("Ahmet Kamil", "example@gmail.com", "87658765").bilgileriGoster();
    }
}
