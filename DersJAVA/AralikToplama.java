import java.util.Scanner;

public class AralikToplama {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Başlangıç Değerini Gİrin (a): ");
        int a = sc.nextInt();

        System.out.println("Bitiş değerini girin (b): ");
        int b = sc.nextInt();

        int toplam = 0;

        for ( int i = a; i <= b; i++) {
            toplam += i; 
        }
        System.out.println(a + " ile " + b + " arasındaki sayıların toplamı: " + toplam);

        sc.close();
    }
    
}

//
