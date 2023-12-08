// Java'da dizi kullanımını gösteren basit bir program

public class DiziOrnegi {

	public static void main(String[] args) {
		// Dizi oluştur ve elemanlarıyla birlikte tanımla
		int[] sayiDizisi = {1, 2, 3, 4, 5};

		// Diziyi ekrana yazdır
		System.out.println("Dizi Elemanları:");
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.print(sayiDizisi[i] + " ");
		}
		System.out.println();

		// Dizi elemanlarını topla
		int toplam = 0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			toplam += sayiDizisi[i];
		}

		// Toplamı ekrana yazdır
		System.out.println("Dizi Elemanlarının Toplamı: " + toplam);

		// Dizi elemanlarını güncelle
		sayiDizisi[2] = 10;

		// Güncellenmiş diziyi ekrana yazdır
		System.out.println("Güncellenmiş Dizi Elemanları:");
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.print(sayiDizisi[i] + " ");
		}
	}
}