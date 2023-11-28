import java.util.Scanner;

public class basamakSayiTopla {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        int basamakToplam = 0;
        sc.close();

        while(sayi > 0) {
            basamakToplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Basamak Toplamı: " + basamakToplam);

    }
}

