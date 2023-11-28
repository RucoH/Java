package Odevler;
import java.util.Scanner;

public class odevAsalCozum {
    boolean asalMi(int sayi){
        for(int i = 2; i < sayi; i++){
            if(sayi % i == 0) {
                return false;
            }
        } return true;
    }



    public static void main(String[] args){

        odevAsalCozum odev = new odevAsalCozum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayı gir");
        int sayi = sc.nextInt();
        System.out.println("girilen sayı " + sayi + " dır.");
        sc.close();

        while(true){
            if(odev.asalMi(++sayi) == true) {
                System.out.println(sayi + " asal sayıdır");
                break;
            }
            else {
                System.out.println(sayi + " asal sayı değildir");
            }
        }
    }
}
    
