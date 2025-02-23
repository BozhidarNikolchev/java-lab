import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sweet = scanner.nextLine();
        int orderedSweets = Integer.parseInt(scanner.nextLine());
        int decemberDate = Integer.parseInt(scanner.nextLine());

        double priceOfSweet = 0.0;

        switch (sweet) {
            case "Cake":
                if (decemberDate <= 15) {
                    priceOfSweet = orderedSweets * 24;
                    priceOfSweet = priceOfSweet - (priceOfSweet * 0.10);

                } else if (decemberDate <= 31) {
                    priceOfSweet = orderedSweets * 28.70;
                }

                if (decemberDate <= 22) {
                    if (priceOfSweet >= 100 && priceOfSweet <= 200) {
                        priceOfSweet = priceOfSweet - (priceOfSweet * 0.15);

                    } else if (priceOfSweet > 200) {
                        priceOfSweet = priceOfSweet - (priceOfSweet * 0.25);
                    }
                }
                break;

            case "Souffle":
                if (decemberDate <= 15) {
                    priceOfSweet = orderedSweets * 6.66;
                    priceOfSweet = priceOfSweet - (priceOfSweet * 0.10);

                } else if (decemberDate <= 31) {
                    priceOfSweet = orderedSweets * 9.80;
                }

                if (decemberDate <= 22) {
                    if (priceOfSweet >= 100 && priceOfSweet <= 200) {
                        priceOfSweet = priceOfSweet - (priceOfSweet * 0.15);

                    } else if (priceOfSweet > 200) {
                        priceOfSweet = priceOfSweet - (priceOfSweet * 0.25);
                    }
                }
                break;

            case "Baklava":
                if (decemberDate <= 15) {
                    priceOfSweet = orderedSweets * 12.60;
                    priceOfSweet = priceOfSweet - (priceOfSweet * 0.10);

                } else if (decemberDate <= 31) {
                    priceOfSweet = orderedSweets * 16.98;
                }

                if (decemberDate <= 22) {
                    if (priceOfSweet >= 100 && priceOfSweet <= 200) {
                        priceOfSweet = priceOfSweet - (priceOfSweet * 0.15);

                    } else if (priceOfSweet > 200) {
                        priceOfSweet = priceOfSweet - (priceOfSweet * 0.25);
                    }
                }
                break;
        }

        System.out.printf("%.2f", priceOfSweet);

    }
}
