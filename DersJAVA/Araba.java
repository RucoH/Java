public class Araba {
	private String marka;
    private String renk;

	public Araba(String marka, String renk) {
		this.marka = marka;
        this.renk = renk;
	}

	public String getMarka() {
		return marka;
	}
    
    public String getRenk() {
        return renk;
    }
	public static void main(String[] args) {
		Araba araba1 = new Araba("Toyota", "Mavi"); // araba1 referansı oluşturuluyor
		Araba araba2 = new Araba("Mazda" , "Siyah"); // araba2, araba1'i işaret ediyor

		System.out.println("Araba 1 Markası: " + araba1.getMarka());
        System.out.println("Araba 1 Rengi: " + araba1.getRenk());
        System.out.println();
		System.out.println("Araba 2 Markası: " + araba2.getMarka());
        System.out.println("Araba 2 Rengi: " + araba2.getRenk());
	}
}