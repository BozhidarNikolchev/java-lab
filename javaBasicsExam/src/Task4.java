import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int catsCount = Integer.parseInt(scanner.nextLine());

        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double foodInGrams = 0.0;

        for (int i = 0; i < catsCount; i++) {
            double foodGramsPerCat = Double.parseDouble(scanner.nextLine());

            if (foodGramsPerCat >= 100 && foodGramsPerCat < 200) {
                group1 += 1;

            } else if (foodGramsPerCat >= 200 && foodGramsPerCat < 300) {
                group2 += 1;

            } else if (foodGramsPerCat >= 300 && foodGramsPerCat < 400) {
                group3 += 1;
            }

            foodInGrams += foodGramsPerCat;

        }

        double foodInKilos = foodInGrams / 1000;
        double foodTotal = foodInKilos * 12.45;

        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);
        System.out.printf("Price for food per day: %.2f lv.", foodTotal);


    }
}
