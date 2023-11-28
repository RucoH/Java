import java.util.Scanner;
public class sicaklikDonusum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;

        System.out.println("celsius: " + celsius + " kelvin: " + kelvin );

        scanner.close();
        
    }
}
