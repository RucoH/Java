import java.util.Scanner;

public class faktoriyel {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int n = scanner.nextInt();
        int faktoriyel = 1; 
        int sayac = 1;

        while (sayac <= n) {
            faktoriyel *= sayac;
            sayac++;
        }
        System.out.println(n + " Faktoriyeli: " + faktoriyel);

        scanner.close();
    
    }

}
