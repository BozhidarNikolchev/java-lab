import java.util.Scanner;

public class BottleDeposit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int halfLiterBottles = scanner.nextInt();
        int oneLiterBottles = scanner.nextInt();

        double depositCalcForHalfLiterBottles = halfLiterBottles * 0.1;
        double depositCalcForOneLiterBottles = oneLiterBottles * 0.25;

        double depositSum = depositCalcForHalfLiterBottles + depositCalcForOneLiterBottles;

        System.out.printf("%.2f", depositSum);
    }
}
