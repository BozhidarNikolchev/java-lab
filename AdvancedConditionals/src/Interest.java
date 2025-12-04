import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositedSum = scanner.nextDouble();

        double interest = 0;
        double nextYearSum = 0;

        for (int i = 0; i < 3; i++) {
            interest = depositedSum * 0.05;
            nextYearSum = depositedSum + interest;

            System.out.printf("%.2f%n", nextYearSum);
            depositedSum = nextYearSum;
        }
    }
}
