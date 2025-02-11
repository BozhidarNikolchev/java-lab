import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = Integer.parseInt(scanner.nextLine());

        double maxNumber = -10000;
        double minNumber = 10000;
        double sum = 0;

        for (int i = 0; i < countOfNumbers; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

            sum += currentNumber;
        }

        double average = sum / countOfNumbers;

        System.out.printf("min=%.2f%n", minNumber);
        System.out.printf("max=%.2f%n", maxNumber);
        System.out.printf("sum=%.2f%n", sum);
        System.out.printf("avg=%.2f", average);


    }
}
