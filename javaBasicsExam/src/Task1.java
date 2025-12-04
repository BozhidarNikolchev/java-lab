import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfPaintBoxes = Integer.parseInt(scanner.nextLine());
        int countOfWallpaperRolls = Integer.parseInt(scanner.nextLine());
        double pairOfGlovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        double paintBoxPrice = countOfPaintBoxes * 21.50;
        double wallPaperPrice = countOfWallpaperRolls * 5.20;

        double countOdGloves = Math.ceil(countOfWallpaperRolls * 0.35);
        double countOfBrushes = Math.floor(countOfPaintBoxes * 0.48);

        double glovesPrice = pairOfGlovesPrice * countOdGloves;
        double brushesPrice = countOfBrushes * brushPrice;

        double totalPrice = paintBoxPrice + wallPaperPrice + glovesPrice + brushesPrice;

        double result = ((double) 1 / 15) * totalPrice;

        System.out.printf("This delivery will cost %.2f lv.", result);

    }
}
