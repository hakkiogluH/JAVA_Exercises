package Exercises_Habip.Udemy.OOPs.OOPs_Giris;

public class Araba {    // public, private falan Access Modifier --- Erişim belirleyici diye geçiyor.

    private String renk;                   // Bunları private yaparsan Araba_Test classından buna direkt olarak ulaşamazsın. Dolaylı yoldan
    private int kapilar;                    // ulaşılabilir. Public metodlar oluşturarak
    private int tekerlekler;
    private String motor;
    private String model;


    public void setModel(String model){
        this.model = model;              // sağdaki modelin parametresi, soldaki üstteki private string kısmındaki model
                                         // this koydukki üstteki model olduğunu anlasın

    }

    public String getModel(){
        return this.model;                 // *****Onemli: Normalde buraya kadar yaptık. Sonra bu dosyadayken üstten Refactor/Encapsulate Fields
                                           //               seçip tüm alanları seçiyorsun ve intellij diğerlerini senin yerine yapıyor
                                           // Bu şekilde yaparsak eğer metodun altını istediğimiz gibi koşullandırırız ve kimse yanlış veri giremez.
                                           // Mesela kimse tekerlek sayısına yanlışlıkla -4 giremez. Ama public yapsak girebilirdi.
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {


        if (kapilar < 0) {
            System.out.println("Kapı sayısı 0'dan küçük olamaz.");
        }
        else
            this.kapilar = kapilar;                                   // Bu da buraya kaydı. Dikkatli inceleyelim
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
