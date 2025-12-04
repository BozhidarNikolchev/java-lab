import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countOfFishermen = scanner.nextInt();

        double discount = 0.0;
        int rent;

        switch (season) {
            case "Spring":
                rent = 3000;
                if (countOfFishermen >= 1 && countOfFishermen <= 6) {
                    discount = rent - (rent * 0.10);

                } else if (countOfFishermen <= 11) {
                    discount = rent - (rent * 0.15);

                } else {
                    discount = rent - (rent * 0.25);

                }

                if (countOfFishermen % 2 == 0) {
                    discount = discount - (discount * 0.05);

                }

                break;

            case "Summer":
                rent = 4200;
                if (countOfFishermen >= 1 && countOfFishermen <= 6) {
                    discount = rent - (rent * 0.10);

                } else if (countOfFishermen <= 11) {
                    discount = rent - (rent * 0.15);

                } else {
                    discount = rent - (rent * 0.25);

                }

                if (countOfFishermen % 2 == 0) {
                    discount = discount - (discount * 0.05);

                }

                break;


            case "Autumn":
                rent = 4200;
                if (countOfFishermen >= 1 && countOfFishermen <= 6) {
                    discount = rent - (rent * 0.10);

                } else if (countOfFishermen <= 11) {
                    discount = rent - (rent * 0.15);

                } else {
                    discount = rent - (rent * 0.25);

                }

                break;

            case "Winter":
                rent = 2600;
                if (countOfFishermen >= 1 && countOfFishermen <= 6) {
                    discount = rent - (rent * 0.10);

                } else if (countOfFishermen <= 11) {
                    discount = rent - (rent * 0.15);

                } else {
                    discount = rent - (rent * 0.25);

                }

                if (countOfFishermen % 2 == 0) {
                    discount = discount - (discount * 0.05);

                }

                break;
        }

        if (groupBudget > discount) {
            System.out.printf("Yes! You have %.2f leva left.", groupBudget - discount);

        } else if (groupBudget == discount) {
            System.out.printf("Yes! You have %.2f leva left.", groupBudget - discount);

        } else {
            System.out.printf("Not enough money! You need %.2f leva.", discount - groupBudget);
        }

    }
}
