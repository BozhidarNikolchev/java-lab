import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stayDays = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String valuation = scanner.nextLine();

        int nights = stayDays - 1;

        double price = 0.0;

        switch (roomType) {
            case "room for one person":
                price = nights * 18.00;
                break;

            case "apartment":
                price = nights * 25.00;

                if (stayDays < 10) {
                    price = price - (price * 0.30);

                } else if (stayDays <= 15) {
                    price = price - (price * 0.35);

                } else {
                    price = price - (price * 0.50);
                }
                break;

            case "president apartment":
                price = nights * 35.00;

                if (stayDays < 10) {
                    price = price - (price * 0.10);

                } else if (stayDays <= 15) {
                    price = price - (price * 0.15);

                } else {
                    price = price - (price * 0.20);
                }
                break;

        }

        if (valuation.equals("positive")) {
            price = price + (price * 0.25);

        } else if (valuation.equals("negative")) {
            price = price - (price * 0.10);
        }

        System.out.printf("%.2f", price);

    }
}
