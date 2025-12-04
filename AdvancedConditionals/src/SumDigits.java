import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fourDigitNumber = scanner.next();

        char firstSymbol = fourDigitNumber.charAt(0);
        char secondSymbol = fourDigitNumber.charAt(1);
        char thirdSymbol = fourDigitNumber.charAt(2);
        char fourthSymbol = fourDigitNumber.charAt(3);

        int num1 = Character.getNumericValue(firstSymbol);
        int num2 = Character.getNumericValue(secondSymbol);
        int num3 = Character.getNumericValue(thirdSymbol);
        int num4 = Character.getNumericValue(fourthSymbol);

        int sumResult = num1 + num2 + num3 + num4;

        System.out.println(sumResult);
    }
}
