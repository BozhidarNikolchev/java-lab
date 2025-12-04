import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int productsCount = Integer.parseInt(scanner.nextLine());

        int i = 0;

        while (i < productsCount) {
            double priceOfProduct = Double.parseDouble(scanner.nextLine());

            double discount = priceOfProduct - (priceOfProduct * 0.65);

            System.out.printf("%n%.2f", discount);
            i++;
        }
    }
}
