import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantityOfProduct = Double.parseDouble(scanner.nextLine());

        double result = 0;


        if (dayOfWeek.equals("Monday")
                || dayOfWeek.equals("Tuesday")
                || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday")
                || dayOfWeek.equals("Friday")) {

            switch (fruit) {
                case "banana" -> result = quantityOfProduct * 2.50;
                case "apple" -> result = quantityOfProduct * 1.20;
                case "orange" -> result = quantityOfProduct * 0.85;
                case "grapefruit" -> result = quantityOfProduct * 1.45;
                case "kiwi" -> result = quantityOfProduct * 2.70;
                case "pineapple" -> result = quantityOfProduct * 5.50;
                case "grapes" -> result = quantityOfProduct * 3.85;
                default -> System.out.println("error");
            }

        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {

            switch (fruit) {
                case "banana" -> result = quantityOfProduct * 2.70;
                case "apple" -> result = quantityOfProduct * 1.25;
                case "orange" -> result = quantityOfProduct * 0.90;
                case "grapefruit" -> result = quantityOfProduct * 1.60;
                case "kiwi" -> result = quantityOfProduct * 3.00;
                case "pineapple" -> result = quantityOfProduct * 5.60;
                case "grapes" -> result = quantityOfProduct * 4.20;
                default -> System.out.println("error");
            }

        } else {
            System.out.println("error");
        }

        if (result != 0) {
            System.out.printf("%.2f", result);
        }

    }
}
