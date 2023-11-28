
import java.util.Scanner;

public class YanPiramit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int satirSayisi = sc.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= satirSayisi - i; j++) {
                System.out.print(" "); // Boşlukları ekrana yazdır
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Yıldızları ekrana yazdır
            }
            System.out.println(); // Yeni satıra geç
        }

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "); // Boşlukları ekrana yazdır
            }
            for (int k = 1; k <= satirSayisi - i ; k++) {
                System.out.print("*"); // Yıldızları ekrana yazdır
            }
            System.out.println(); // Yeni satıra geç
        }

        sc.close();
    }
}