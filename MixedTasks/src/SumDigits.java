import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputNumber = scanner.nextLine();

        char firstDigit = inputNumber.charAt(0);
        char secondDigit = inputNumber.charAt(1);
        char thirdDigit = inputNumber.charAt(2);
        char fourthDigit = inputNumber.charAt(3);

        int firstDigitToNum = Character.getNumericValue(firstDigit);
        int secondDigitToNum = Character.getNumericValue(secondDigit);
        int thirdDigitToNum = Character.getNumericValue(thirdDigit);
        int fourthDigitToNum = Character.getNumericValue(fourthDigit);

        int sum = firstDigitToNum + secondDigitToNum + thirdDigitToNum + fourthDigitToNum;

        System.out.println(sum);

    }
}
