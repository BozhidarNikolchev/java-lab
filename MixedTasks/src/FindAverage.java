import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());
            sum += currentNum;
        }

        double result = sum / n;

        System.out.printf("%.2f", result);
    }
}