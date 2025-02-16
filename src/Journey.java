import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String holidayType = "";
        double spentMoney = 0.0;

        switch (season) {
            case "summer":

                if (budget <= 100) {
                    holidayType = "Camp";
                    destination = "Bulgaria";
                    spentMoney = budget * 0.30;

                } else if (budget <= 1000) {
                    holidayType = "Camp";
                    destination = "Balkans";
                    spentMoney = budget * 0.40;

                } else {
                    holidayType = "Hotel";
                    destination = "Europe";
                    spentMoney = budget * 0.90;

                }

                System.out.printf("Somewhere in %s%n %s - %.2f", destination, holidayType, spentMoney);

                break;

            case "winter":

                if (budget <= 100) {
                    holidayType = "Hotel";
                    destination = "Bulgaria";
                    spentMoney = budget * 0.70;

                } else if (budget <= 1000) {
                    holidayType = "Hotel";
                    destination = "Balkans";
                    spentMoney = budget * 0.80;

                } else {
                    holidayType = "Hotel";
                    destination = "Europe";
                    spentMoney = budget * 0.90;

                }

                System.out.printf("Somewhere in %s%n %s - %.2f", destination, holidayType, spentMoney);

                break;
        }

    }
}
