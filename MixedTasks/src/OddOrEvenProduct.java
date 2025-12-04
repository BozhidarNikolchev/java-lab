import java.util.Scanner;

public class OddOrEvenProduct {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String indexNumbers = scanner.nextLine();

        String[] numbersToArray = indexNumbers.split(" ");
        int[] numbers = new int[numbersToArray.length];

        int oddSum = 1;
        int evenSum = 1;

        for (int i = 0; i < n; i += 2) {
            numbers[i] = Integer.parseInt(numbersToArray[i]);
            oddSum *= numbers[i];
        }

        for (int i = 1; i < n; i += 2) {
            numbers[i] = Integer.parseInt(numbersToArray[i]);
            evenSum *= numbers[i];
        }

        if (oddSum == evenSum) {
            System.out.printf("yes %d", oddSum);

        } else {
            System.out.printf("no %d %d", oddSum, evenSum);
        }

    }
}
