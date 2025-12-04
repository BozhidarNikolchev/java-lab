import java.util.Scanner;

public class SuppliesForSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPackages = Integer.parseInt(scanner.nextLine());
        int markerPackages = Integer.parseInt(scanner.nextLine());
        int whiteBoardCleanerInLitres = Integer.parseInt(scanner.next());
        int discountPercentage = Integer.parseInt(scanner.next());

        double penPackagesPrice = penPackages * 5.80;
        double markerPackagesPrice = markerPackages * 7.20;
        double cleanerPrice = whiteBoardCleanerInLitres * 1.20;

        double priceForAllMaterials = penPackagesPrice + markerPackagesPrice + cleanerPrice;
        double priceWithDiscount = priceForAllMaterials - (priceForAllMaterials * 0.25);

        System.out.println(priceWithDiscount);
    }
}

