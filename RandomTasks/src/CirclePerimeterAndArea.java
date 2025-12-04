import java.util.Scanner;

public class CirclePerimeterAndArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("%.2f%n%.2f", perimeter,area);
    }
}
