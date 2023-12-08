public class DiziOrnegi2 {
    public static void main(String[] args) {
        int[] dizi = new int[5];
        dizi[2] = 5;
        dizi[3] = dizi[2] * dizi[2];
        dizi[4]++; 
        dizi[dizi.length -1] = 3;

        System.out.println(dizi[4] + " " + dizi[3]);

    }
}
