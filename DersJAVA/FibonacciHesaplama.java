import java.util.Scanner;

public class FibonacciHesaplama {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Fibonacci dizisinin kaçıncı terimini hesaplamak istersiniz? ");
		int n = scanner.nextInt();

		scanner.close();

		long fib1 = 0; // İlk terim
		long fib2 = 1; // İkinci terim

		System.out.print("Fibonacci Dizisi: " + fib1 + ", " + fib2);

		for (int i = 2; i < n; i++) {
			long sonrakiTerim = fib1 + fib2;
			System.out.print(", " + sonrakiTerim);

			fib1 = fib2;
			fib2 = sonrakiTerim;
		}

		System.out.println();
	}
}