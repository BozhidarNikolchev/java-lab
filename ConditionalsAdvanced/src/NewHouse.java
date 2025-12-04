import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowersCount = scanner.nextInt();
        int budget = scanner.nextInt();

        double finalPrice = 0.0;

        switch (flower) {
            case "Roses":
                finalPrice = flowersCount * 5;
                if (flowersCount > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.10);
                }

                break;

            case "Dahlias":
                finalPrice = flowersCount * 3.80;
                if (flowersCount > 90) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }

                break;

            case "Tulips":
                finalPrice = flowersCount * 2.80;
                if (flowersCount > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }

                break;

            case "Narcissus":
                finalPrice = flowersCount * 3;
                if (flowersCount < 120) {
                    finalPrice = finalPrice + (finalPrice * 0.15);
                }

                break;

            case "Gladiolus":
                finalPrice = flowersCount * 2.50;
                if (flowersCount < 80) {
                    finalPrice = finalPrice + (finalPrice * 0.20);
                }

                break;
        }

        if (budget > finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flower, budget - finalPrice);

        } else if (budget == finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flower, budget - finalPrice);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice - budget);
        }
    }
}
