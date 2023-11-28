package SinavSorulari;

public class Soru3 {
    private String renk;
    
    public Soru3() {
        this("beyaz");
    }
    
    public Soru3(String renk) {
        this.renk = renk;
    }
    
    public static void main(String[] args) {
        Soru3 e = new Soru3();
        System.out.println("Renk:" + e.renk);
        Soru3 ee = new Soru3("kırmızı");
        System.out.println("Renk:" + ee.renk);
    }
}
