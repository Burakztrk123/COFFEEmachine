import java.util.Scanner;

public class KahveMakinesi {

    public static void main(String[] args) {
        // Kullanıcıdan kahve seçimini al
        System.out.println("Hangi Kahveyi İstersiniz?");
        System.out.println("1. Türk kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");

        Scanner scanner = new Scanner(System.in);
        String hangiKahve = scanner.nextLine().toLowerCase(); // Küçük harfe dönüştürerek harf duyarlılığını ortadan kaldır

        // Kahve türüne göre işlemleri yap
        if (hangiKahve.equals("türk kahvesi")) {
            System.out.println(hangiKahve + " hazırlanıyor.");
        } else if (hangiKahve.equals("filtre kahve")) {
            System.out.println(hangiKahve + " hazırlanıyor.");
        } else if (hangiKahve.equals("espresso")) {
            System.out.println(hangiKahve + " hazırlanıyor...");
        } else {
            System.out.println("Hatalı tuşlama yaptınız.");
        }

        // Süt ekleme durumu
        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
        String sut = scanner.nextLine().toLowerCase(); // Küçük harfe dönüştür

        if (sut.equals("evet")) {
            System.out.println("Süt ekleniyor...");
        } else if (sut.equals("hayır")) {
            System.out.println("Süt eklenmiyor");
        }

        // Şeker ekleme durumu
        System.out.println("Şeker ister misiniz? (Evet veya hayır cevabını veriniz):");
        String seker = scanner.nextLine().toLowerCase(); // Küçük harfe dönüştür

        // Şeker ekleme işlemleri
        if (seker.equals("evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = scanner.nextInt();
            System.out.println(kacSeker + " şeker ekleniyor.");
            scanner.nextLine(); // Dummy kod: bir int girdisinin ardından String girdisi için dummy bir nextLine() kullanmalısınız
        } else if (seker.equals("hayır")) {
            System.out.println("Şeker eklenmiyor");
            scanner.nextLine(); // Dummy kod
        }

        // Kahve boyutu seçimi
        System.out.println("Hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy olarak giriniz.):");
        String boyut = scanner.nextLine().toLowerCase(); // Küçük harfe dönüştür

        // Kahve boyutuna göre sonuçları yazdır
        if (boyut.equals("büyük boy")) {
            System.out.println("Kahveniz büyük boy hazırlanıyor.");
        } else if (boyut.equals("orta boy")) {
            System.out.println("Kahveniz orta boy hazırlanıyor.");
        } else if (boyut.equals("küçük boy")) {
            System.out.println("Kahveniz küçük boy hazırlanıyor.");
        }

        // Siparişin son hali
        System.out.println(hangiKahve.substring(0, 1).toUpperCase() + hangiKahve.substring(1) + " " + boyut + " hazırdır. Afiyet olsun!");
    }
}


