package Exercises_Habip.Udemy.Arrays_Arraylists.Hafiza_Oyunu;

public class Kart {
    private char deger;
    private boolean tahmin = false;

    public Kart(char deger) {
        this.deger = deger;
    }

    /*
    Yapıcının (constructor) ne yaptığını anlamak için sınıfın (class) ne olduğunu anımsamak gerekir.
    Sınıfın yalnızca bir tür-adı (cins-isim) olduğunu söylemiştik.
    Sınıf tanımı o türün niteliklerini (değişkenler)  ve davranışlarını (metotlar) belirler.
    Elimizde o türe ait somut bir öğe (türü temsil eden varlık) varsa, o öğe, sözkonusu türün niteliklerine ve davranışlarına
    işlevlik kazandırır. Dolayısıyla, bir sınıftan, o türe ait öğe(ler) yaratmanın yolları olmalıdır.
    Bir sınıf tanımlandığında, bellekte henüz onu temsil edecek öğeler yoktur (static sınıflar hariç).
    Her sınıf için bu işi yapan özel bir metot vardır. Bu metoda yapıcı (constructor) diyoruz.
    Yapıcının görevi türe ait öğe(ler) yaratmaktır. Java dilinde bu öğelere nesne (object, instance of the class) denir.
    Yapıcı (constructor), yaratılan sınıfın doğal bir parçasıdır ve aksi istenmedikçe ön-tanımlı (default) olarak derleyici
    tarafından oluşturulur ve kendi işlevini yapar. Constructor, javadaki öteki metotlardan tamamen farklıdır.
    Bu metodun bir değer-bölgesi yoktur; yani hiçbir değer almaz. Bir tek işlevi vardır: sınıftan nesne(ler) yaratmak.
     */

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}
