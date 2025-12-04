import java.util.Scanner;

public class Arithmetics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double remainder = a % b;
        double powered = Math.pow(a, b);

        System.out.printf("%.0f%n%.0f%n%.0f%n%.0f%n%.0f", sum, difference, product, remainder, powered);

    }
}
