import java.util.Scanner;

public class SonrakiAsalSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int girilenSayi = sc.nextInt();

        int sonrakiAsalSayi = bulSonrakiAsalSayi(girilenSayi);

        System.out.println(girilenSayi + " sayısından sonraki ilk asal sayı: " + sonrakiAsalSayi);
        sc.close();
    }
    

    // Verilen sayıdan sonraki ilk asal sayıyı bulan fonksiyon
    private static int bulSonrakiAsalSayi(int sayi) {
        while (true) {
            sayi++;

            if (asalMi(sayi)) {
                return sayi;
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    private static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}