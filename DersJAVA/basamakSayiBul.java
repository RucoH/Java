import java.util.Scanner;

public class basamakSayiBul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        int sayi = sc.nextInt();
        int basamakSayi = 0; 
        sc.close();
        while(sayi > 0) {
            sayi /= 10;
            basamakSayi++;

        }
    
        System.out.println("Basamak Sayısı: " + basamakSayi);
    } 
}
