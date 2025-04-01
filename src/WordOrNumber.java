import java.text.DecimalFormat;
import java.util.Scanner;

public class WordOrNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();

        try {
            double isNumber = Double.parseDouble(inputData);
            isNumber += 1;
            DecimalFormat format = new DecimalFormat("##.##");
            String formatedNumber = format.format(isNumber);
            System.out.printf("%s", formatedNumber);

        } catch (NumberFormatException nfe) {
            for (int i = inputData.length() - 1; i >= 0; i--) {
                reversed.append(inputData.charAt(i));
            }

            System.out.println(reversed);
        }

    }
}