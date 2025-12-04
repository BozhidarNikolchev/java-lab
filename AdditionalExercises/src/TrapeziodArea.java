import java.util.Scanner;

public class TrapeziodArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double h = scanner.nextDouble();

        double area = (b1 + b2) * (h / 2);

        System.out.printf("%.2f", area);
    }
}
