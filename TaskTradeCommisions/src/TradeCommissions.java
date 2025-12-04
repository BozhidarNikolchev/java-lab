import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        switch (city) {
            case "Sofia":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    commission = salesVolume * 0.05;

                } else if (salesVolume <= 1000) {
                    commission = salesVolume * 0.07;

                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    commission = salesVolume * 0.08;

                } else if (salesVolume > 10000) {
                    commission = salesVolume * 0.12;

                } else {
                    System.out.println("error");
                }
                break;

            case "Varna":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    commission = salesVolume * 0.045;

                } else if (salesVolume <= 1000) {
                    commission = salesVolume * 0.075;

                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    commission = salesVolume * 0.10;

                } else if (salesVolume > 10000) {
                    commission = salesVolume * 0.13;

                } else {
                    System.out.println("error");
                }
                break;

            case "Plovdiv":
                if (salesVolume >= 0 && salesVolume <= 500) {
                    commission = salesVolume * 0.055;

                } else if (salesVolume > 500 && salesVolume <= 1000) {
                    commission = salesVolume * 0.08;

                } else if (salesVolume > 1000 && salesVolume <= 10000) {
                    commission = salesVolume * 0.12;

                } else if (salesVolume > 10000) {
                    commission = salesVolume * 0.145;

                } else {
                    System.out.println("error");
                }
                break;

            default:
                System.out.println("error");

        }

        if (commission != 0) {
            System.out.printf("%.2f", commission);

        }
    }
}
