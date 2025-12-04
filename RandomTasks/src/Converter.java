import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int milesPerGallon = scanner.nextInt();

        double milesToKilometers = 1.6;
        double gallonsToLitres = 4.54;

        double consumption = Math.floor(gallonsToLitres / (milesPerGallon * milesToKilometers) * 100);

        System.out.printf("%.0f litres per 100 km", consumption);

    }
}
