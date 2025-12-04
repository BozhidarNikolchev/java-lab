import java.util.Scanner;

public class NotDivisibleNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int targetNumber = scanner.nextInt();

        int number = 1;

        for (int i = 0; i < targetNumber; i++) {
            if (number % 3 != 0 && number % 7 != 0) {
                System.out.print(number + " ");
            }

            number++;
        }
    }
}