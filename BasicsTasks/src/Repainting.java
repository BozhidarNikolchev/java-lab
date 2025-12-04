import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paintInLitres = Integer.parseInt(scanner.nextLine());
        int thinnerInLitres = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = paintInLitres * 14.50;
        paintPrice = paintPrice + (paintPrice * 0.10);
        double thinnerPrice = thinnerInLitres * 5.00;
        double bagsPrice = 0.40;

        double allMaterialsPrice = nylonPrice + paintPrice + thinnerPrice + bagsPrice;
        double workersPrice = (allMaterialsPrice * 0.30) * workingHours;

        double finalPrice = allMaterialsPrice + workersPrice;

        System.out.println(finalPrice);


    }
}

