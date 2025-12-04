import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (product.equals("coffee")) {
            switch (city) {
                case "Sofia" -> price = quantity * 0.50;
                case "Plovdiv" -> price = quantity * 0.40;
                case "Varna" -> price = quantity * 0.45;
            }

        } else if (product.equals("water")) {
            switch (city) {
                case "Sofia" -> price = quantity * 0.80;
                case "Plovdiv" -> price = quantity * 0.70;
                case "Varna" -> price = quantity * 0.70;
            }

        } else if (product.equals("beer")) {
            switch (city) {
                case "Sofia" -> price = quantity * 1.20;
                case "Plovdiv" -> price = quantity * 1.15;
                case "Varna" -> price = quantity * 1.10;
            }

        } else if (product.equals("sweets")) {
            switch (city) {
                case "Sofia" -> price = quantity * 1.45;
                case "Plovdiv" -> price = quantity * 1.30;
                case "Varna" -> price = quantity * 1.35;
            }

        } else if (product.equals("peanuts")) {
            switch (city) {
                case "Sofia" -> price = quantity * 1.60;
                case "Plovdiv" -> price = quantity * 1.50;
                case "Varna" -> price = quantity * 1.55;
            }

        }

        System.out.println(price);
    }
}
