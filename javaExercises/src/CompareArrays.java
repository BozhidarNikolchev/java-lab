import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        // or with Integer.parseInt(scanner.nextLine());

        StringBuilder firstNumbers = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String currentNum = scanner.nextLine();
            firstNumbers.append(currentNum);
        }

        StringBuilder secondNumbers = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String currentNum = scanner.nextLine();
            secondNumbers.append(currentNum);
        }

        boolean areEqual = firstNumbers.toString().contentEquals(secondNumbers);

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}