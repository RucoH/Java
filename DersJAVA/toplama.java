import java.util.Scanner;
public class toplama {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("İlk sayıyı giriniz");
        int num1 = sc.nextInt();
        
        System.out.println("İkinci sayiyi giriniz");
        int num2 = sc.nextInt();
        
        sc.close();

        int sonuc = num1 + num2;

        System.out.println(sonuc);
    }
}
