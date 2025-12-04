import java.util.Scanner;

public class SumOfFiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int fourthNum = scanner.nextInt();
        int fifthNum = scanner.nextInt();

        int sum = firstNum + secondNum + thirdNum + fourthNum + fifthNum;

        System.out.println(sum);


    }
}
