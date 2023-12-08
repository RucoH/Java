public class DiziOrnegi4 {
    public static void main(String[] args) {
        int [] dizi1 = {0, 6, 2, 6 ,7, 9, 10,};
        int [] dizi2 = {0, 16, 12, 16 ,7, 19, 10,};

        for(int eleman1 : dizi1) {
            for (int eleman2 : dizi2) {
                if ( eleman1 == eleman2) {
                    System.out.println("Eşleşen Çift Eleman " + eleman1);
                }
            }
        } 
    }
    
}
