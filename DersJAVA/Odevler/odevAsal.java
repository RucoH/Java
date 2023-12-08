package Odevler;
import java.util.Scanner;  	//Burada Kullanıcıdan alacağımız veriyi çekme işlemi için scanner import ettik

//Kodların Çalışması için yeni bir sınıf oluşturduk.
public class odevAsal {

	public static void main(String[] args) {

		System.out.println("-----GİRDİĞİNİZ SAYIDAN BİR SONRAKİ ASAL SAYIYI BULMA UYGULAMASINA HOŞGELDİNİZ-----");

		Scanner sc = new Scanner(System.in);					//Scanner'ı sisteme tanımladık.
		System.out.print("Bir sayı giriniz: "); 
		int girilenSayi = sc.nextInt(); 						//Kullanıcın girdiği veriyi tam sayı olarak aldık.
		sc.close(); 											//Scanner'ı kapattık 

		if (girilenSayi <= 1) {									//1 ve 1'den küçük sayılar asal sayı olmayacağı için Kullanıcıdan veriyi 2'nin üstünde bir sayı istiyoruz.
			System.out.println("Lütfen 2'den büyük bir pozitif sayı girin.");
			return;
		} else {
			SonrakiAsalSayiBul(girilenSayi); 					//Eğer 2'nin üstünde bir veri alırsak bu kod çalışıyor ve aldığımız veriyi aşağıdaki fonksiyona taşıyoruz.
		}
	}

	public static void SonrakiAsalSayiBul(int sonrakiAsalSayi) {

		boolean asalMi = false; 								// Sayının asal olup olmadığını kontrol etmek için bir bayrak (flag) başlattık.

		while (!asalMi) {

			asalMi = true;
			sonrakiAsalSayi++;									//Girdiğimiz sayıya +1 ekleyerek sayının asallığını kontrol edeceğiz			

			for (int i = 2; i <= sonrakiAsalSayi / 2; i++) {	// 2'den başlayarak sayının yarısına kadar olan tüm bölenleri kontrol ettik
				if (sonrakiAsalSayi % i == 0) {
					// Bölünüyorsa, sayı asal değildir
					asalMi = false;
					break;
				}
			}

			if (asalMi) {
				System.out.println("Sonraki Asal Sayı: " + sonrakiAsalSayi); //Sonraki asal sayıyı Ekrana yazdırdık
			}

		}
	}

}