
import java.util.Scanner;

public class OndanBuyukMu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk Sayı Giriniz: ");
        double num1 = scanner.nextDouble();

        System.out.println("İkinci Sayıyı Giriniz: ");  
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        
        System.out.println(sum);

        if (sum > 10) {
            System.out.println("Bu sayı 10 dan büyük");
        
        }
        else {
            System.out.println("bu sayı 10 dan küçük");
        }
        
        scanner.close();


        
    }
}