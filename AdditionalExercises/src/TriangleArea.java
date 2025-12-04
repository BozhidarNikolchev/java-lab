import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideA = scanner.nextDouble();
        double h = scanner.nextDouble();

        double area = (sideA * h) / 2;

        System.out.printf("%.2f", area);
    }
}
