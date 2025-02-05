import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double priceOfProduct = Double.parseDouble(scanner.nextLine());
        Double customersMoney = Double.parseDouble(scanner.nextLine());

        double wholeChange = (customersMoney - priceOfProduct) * 100;

        double oneLev;

        if (wholeChange >= 100) {
            oneLev = Math.floor(wholeChange / 100);
            wholeChange = wholeChange % 100;
            System.out.printf("%.0f x 1 lev\n", oneLev);
        }

        if (wholeChange >= 50) {
            wholeChange = wholeChange - 50;
            System.out.println("1 x 50 stotinki");
        }

        if (wholeChange >= 20) {
            oneLev = Math.floor(wholeChange / 20);
            wholeChange = wholeChange % 20;
            System.out.printf("%.0f x 20 stotinki\n", oneLev);
        }

        if (wholeChange >= 10) {
            wholeChange = wholeChange - 10;
            System.out.println("1 x 10 stotinki");
        }

        if (wholeChange >= 5) {
            wholeChange = wholeChange - 5;
            System.out.println("1 x 5 stotinki");
        }

        if (wholeChange >= 2) {
            oneLev = Math.floor(wholeChange / 2);
            wholeChange = wholeChange % 2;
            System.out.printf("%.0f x 2 stotinki\n", oneLev - 0.5);
        }

        if (wholeChange >= 1) {
            System.out.println("1 x 1 stotinka");
        }


    }
}