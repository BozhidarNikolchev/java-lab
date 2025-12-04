import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddNumbersSum = 0;
        int evenNumbersSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                oddNumbersSum += currentNumber;

            } else {
                evenNumbersSum += currentNumber;
            }
        }

        if (oddNumbersSum == evenNumbersSum) {
            System.out.printf("Yes%nSum = %d", oddNumbersSum);

        } else {
            System.out.printf("No%nDiff = %d", Math.abs(oddNumbersSum - evenNumbersSum));
        }


    }
}
