package OrnekSinavSorulari;

public class Soru5 {
    private static int i = 1;
	public static void main(String argv[]) {
		System.out.println(i);
		int i = 2; 
		Soru5 ornek = new Soru5();
		System.out.println(i);
		ornek.yazdir();
	} 
	public static void yazdir() {
		System.out.println(i);
	} 
}
