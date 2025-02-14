import java.util.Scanner;

public class ExamNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        int targetNum = scanner.nextInt();

        for (int i = startNum; i <= endNum; i++) {
            int firstDigit = (i / 100) % 10;
            int secondDigit = (i / 10) % 10;
            int thirdDigit = i % 10;

            int sum = firstDigit + secondDigit + thirdDigit;

            if (sum == targetNum) {
                System.out.println(i);
            }
        }

    }
}
