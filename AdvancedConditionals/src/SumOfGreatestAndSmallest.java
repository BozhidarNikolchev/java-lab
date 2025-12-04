import java.util.Scanner;

public class SumOfGreatestAndSmallest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();
        double thirdNum = scanner.nextDouble();

        double biggestNum = Math.max(firstNum, Math.max(secondNum, thirdNum));
        double smallestNum = Math.min(firstNum, Math.min(secondNum, thirdNum));

        System.out.printf("%.0f", biggestNum + smallestNum);

    }
}
