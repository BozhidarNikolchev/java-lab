import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vegetablesPriceInKilos = scanner.nextDouble();
        double fruitsPriceInKilos = scanner.nextDouble();
        int totalKilosOfTheVegetables = scanner.nextInt();
        int totalKilosOfTheFruits = scanner.nextInt();

        double priceOfVegetables = vegetablesPriceInKilos * totalKilosOfTheVegetables;
        double priceOfFruits = fruitsPriceInKilos * totalKilosOfTheFruits;

        double totalSum = (priceOfVegetables + priceOfFruits) / 1.94;

        System.out.printf("%.2f", totalSum);
    }
}
