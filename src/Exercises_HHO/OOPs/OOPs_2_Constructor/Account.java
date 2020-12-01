package Exercises_HHO.OOPs.OOPs_2_Constructor;

public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String eMail;
    private String telefonNo;


    public Account () {

        //System.out.println("Kendi yazdığımız constructor...");       // normalde Java kendisi constructor oluşturuyor ama biz bunu girersek
                                                                     // Java'ya sen dur biz gireceğiz demiş oluyoruz

        /*this.hesapNo = "Bilgi yok.";
        this.bakiye = 0.0;
        this.isim = "Bilgi yok";
        this.eMail = "Bilgi yok";
        this.telefonNo = "Bilgi yok";                           Bunu kullanmaya üşenirsek aşağıdakini yapıyoruz. Aşağıdaki metodu çağıracağız

         */

        this("Bilgi yok", 0.0, "Bilgi yok", "Bilgi yok", "Bilgi yok");
    }

    public Account (String hesapNo, double bakiye, String isim, String eMail, String telefonNo){         // Method overloading yapıyoruz. Üstteki account ile aynı adlı metod

        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.eMail = eMail;
        this.telefonNo = telefonNo;
    }

    public Account (String isim, String eMail, String telefonNo){

        /*this.isim = isim;
        this.eMail = eMail;
        this.telefonNo = telefonNo;

        this.hesapNo = "Bilgi yok.";
        this.bakiye = 0.0;
                                                 Bunu nasıl kısac yapacağız?
         */

        this("Bilgi yok" , 0.0, isim,eMail,telefonNo);
    }

    public void bilgileriGoster(){
        System.out.println("Hesap no = " + this.hesapNo);
        System.out.println("isim = " + this.isim);
        System.out.println("bakiye = " + this.bakiye);
        System.out.println("eMail = " + this.eMail);
        System.out.println("Telefon no = " + this.telefonNo);
    }



    public void paraYatir(double miktar){

        bakiye += miktar;
        System.out.println("Yeni bakiye = " + bakiye);
    }

    public void paraCekme(double miktar){

        if (miktar > 1500) System.out.println("Bir günde 1500 TL'den fazla para çekemezsiniz.");
        if (miktar > bakiye) System.out.println("Yeterli bakiyeniz bulunmamaktadır. Bakiye = " + bakiye);
        else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye);
        }
    }



    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
