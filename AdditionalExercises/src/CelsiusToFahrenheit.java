import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double degreesCentigrade = scanner.nextDouble();
        double convertToFahrenheit = degreesCentigrade * ((double) 9 / 5) + 32;

        System.out.printf("%.2f", convertToFahrenheit);

    }
}
