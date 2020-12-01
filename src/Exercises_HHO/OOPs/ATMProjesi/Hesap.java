package Exercises_HHO.OOPs.ATMProjesi;

public class Hesap {

    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public String getKullanici_adi() {                 // // Bu Setters ve Getters'ı üstten Code>Generate>Setters and Getters altından seçerek yaptık.
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public Hesap(String kullanici_adi, String parola, int bakiye) {                     // Bu constuctorları üstten Code>Generate>Constructor altından seçerek yaptık.
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar) {
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz = " + bakiye);
    }

    public void paraCek(int tutar) {
        if (bakiye - tutar < 0) {
            System.out.println("Yeterli bakiye bulunmamaktadır.");
        } else {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
        }

    }
}
