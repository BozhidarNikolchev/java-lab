import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double coeficientA = scanner.nextDouble();
        double coeficientB = scanner.nextDouble();
        double coeficientC = scanner.nextDouble();

        double discriminant = coeficientB * coeficientB - 4 * coeficientA * coeficientC;

        double root1 = (-coeficientB - Math.sqrt(discriminant)) / (2 * coeficientA);
        double root2 = (-coeficientB + Math.sqrt(discriminant)) / (2 * coeficientA);

        if (root1 == -0.0) {
            root1 = Math.abs(root1);
        }

        if (root2 == -0.0) {
            root2 = Math.abs(root2);
        }

        System.out.printf("x1=%.1f%nx2=%.1f", root1, root2);
    }
}
