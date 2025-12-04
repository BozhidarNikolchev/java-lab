import javax.swing.*;
import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenusPrice = chickenMenus * 10.35;
        double fishMenusPrice = fishMenus * 12.40;
        double vegetarianMenusPrice = vegetarianMenus * 8.15;

        double allMenusPrice = chickenMenusPrice + fishMenusPrice + vegetarianMenusPrice;
        double desertPrice = allMenusPrice * 0.20;
        double deliveryPrice = 2.50;

        double finalPrice = allMenusPrice + desertPrice + deliveryPrice;

        System.out.println(finalPrice);
    }
}

