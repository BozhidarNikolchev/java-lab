import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double min = 1000;
        double max = -1000;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double currentNumber = scanner.nextDouble();

            if (currentNumber < min) {
                min = currentNumber;
            }

            if (currentNumber > max) {
                max = currentNumber;
            }

            sum += currentNumber;
        }

        double average = sum / n;

        System.out.printf("min=%.2f%n", min);
        System.out.printf("max=%.2f%n", max);
        System.out.printf("sum=%.2f%n", sum);
        System.out.printf("avg=%.2f", average);
    }
}
