import java.util.Iterator;
import java.util.Scanner;

public class petShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());

        double calcDogFoodPrice = dogFoodPackages * 2.50;
        double calcCatFoodPrice = catFoodPackages * 4;

        double result = calcDogFoodPrice + calcCatFoodPrice;

        System.out.printf("%f lv.", result);

    }
}
