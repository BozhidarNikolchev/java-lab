import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int locationsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locationsCount; i++) {
            double expectedGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            double sumOfGoldPerDay = 0.0;
            for (int j = 0; j < days; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                sumOfGoldPerDay += goldPerDay;
            }

            double averageGoldPerDay = sumOfGoldPerDay / days;

            if (averageGoldPerDay >= expectedGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerDay);
            } else {
                double diff = expectedGold - averageGoldPerDay;
                System.out.printf("You need %.2f gold.%n", diff);
            }
        }

    }
}
