import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositedSum = Double.parseDouble(scanner.nextLine());
        int timeLimitOfDepositInMonths = Integer.parseInt(scanner.nextLine());
        double annualRatePercentage = Double.parseDouble(scanner.nextLine());

        double rate = depositedSum * (annualRatePercentage / 100);
        double rateForOneMonth = rate / 12;
        double result = depositedSum + (timeLimitOfDepositInMonths * rateForOneMonth);

        System.out.println(result);
    }
}

