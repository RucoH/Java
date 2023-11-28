import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        double num1 = sc.nextInt();

        System.out.println("İkinci Sayıyı Giriniz: ");
        double num2 = sc.nextInt();


        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        double answer1 = hesapMakinesi.topla(num1, num2);
        double answer2 = hesapMakinesi.carp(num1, num2);
        double answer3 = hesapMakinesi.bol(num1, num2);

        System.out.println("Toplama Sonucu: " + answer1);
        System.out.println("Çarpım Sonucu: " + answer2);
        System.out.println("Bölüm Sonucu: " + answer3);
        sc.close();
        
    }


    public double topla(double num1 , double num2) {
        return num1 + num2;

    }

    public double carp(double num1, double num2) {
        return num1 * num2;
    }

    public double bol(double num1, double num2) {
        return num1 / num2;

    }
    
}
