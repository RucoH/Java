import java.util.Scanner;

public class asalMi {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı girin: ");
		int sayi = scanner.nextInt();

		scanner.close();

		if (sayi <= 1) {
			System.out.println("Lütfen 2'den büyük bir pozitif sayı girin.");
			return;
		}

		boolean asal = true;

		for (int i = 2; i <= sayi / 2; i++) {
			if (sayi % i == 0) {
				asal = false;
				break;
			}
		}

		if (asal) {
			System.out.println(sayi + " bir asal sayıdır.");
		} else {
			System.out.println(sayi + " bir asal sayı değildir.");
		}
	}
}
