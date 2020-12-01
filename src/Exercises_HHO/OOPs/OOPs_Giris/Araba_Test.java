package Exercises_HHO.OOPs.OOPs_Giris;

public class Araba_Test {

    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        
        /*araba1.renk = "Kırmızı";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println("araba1.motor = " + araba1.motor);

           */                     // Bu yöntemi kullanabiliriz, ancak ve ancak Araba classında veriler public tanımlanırsa.

        // Oradaki değişkenler private tanımlanmışsa aşağıdakini yapıyoruz:

        araba1.setModel("Renault");

        System.out.println("araba1 in modeli = " + araba1.getModel());

        araba1.setKapilar(-4);                       // Diğer modelden buraya uyarı geldi. Kapı sayısı 0'dan küçük olamaz şeklinde. Çalıştırınca tabii

        /*Araba araba2;
        araba2.setKapilar();                         // araba2 başlatılmamış. Herhangi bir objeyi göstermiyor.
*/
        Araba araba3 = null;             // uyarı vermez.
        araba3.setModel("Ford");         // null girmemize rağmen değer atamaya çalıştık. "nullPointerException" hatası verecek
                                         // "Senin bir referansın var. O refereansa değer atamadan erişmeye çalışıyorsun" demek



        // Encapsulation = Kapsülleme ----------> Detayların programcıdan veya kullanıcıdan saklanması.
        // Kumandanın içindeki devreleri görememek gibi. Sen sadece üstteki tuşlara basarsın altta ne döndüğünü bilmezsin.
        // Classların access modifierlarını private yapmak OOP mantığına daha uygun.
        // Çünkü public yaparsak herkes kumandanın içinde ne olduğunu görebilir ve bazen de yanlış şekilde değiştirebilir.
        // Biz bu fonksiyonların yanlış olarak değiştirilmesini ya da uygulanmasını istemeyiz.
        // O halde private olarak oluşturduğumuz bir classa nasıl erişeceğiz?
        //        Bu classlara metodlar ekleyeceğiz ve bu metodlar public olacak. Bu şekilde erişebiliyoruz. Dolaylı bir yol.
        //              Bu yöntemin adı encapsulation



        
        
    }
}
