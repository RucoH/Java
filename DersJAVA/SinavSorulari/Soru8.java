package SinavSorulari;

public class Soru8 {
    public static void main(String[] args) {
		int i; 
		int j; 
		for (i=1; i < 4; i++) { 
			for (j=-2; j < 5; j++) { 
				if (j == 3) { 
					continue; 
				} 
				System.out.println("i: " + i + " j: " + j); 
			} 
		} 
	}
}
