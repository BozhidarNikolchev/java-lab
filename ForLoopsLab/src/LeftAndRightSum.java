import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstNumbersSum = 0;
        int secondNumbersSum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstNumbersSum += currentNum;
        }

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            secondNumbersSum += currentNum;
        }

        if (firstNumbersSum == secondNumbersSum) {
            System.out.printf("Yes, sum = %d", firstNumbersSum);

        } else {
            System.out.printf("No, diff = %d", Math.abs(firstNumbersSum - secondNumbersSum));

        }

    }
}
