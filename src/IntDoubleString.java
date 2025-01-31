import java.util.Scanner;

public class IntDoubleString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputVariable = scanner.nextLine();

        if (inputVariable.equals("integer")) {
            int wholeNumber = Integer.parseInt(scanner.nextLine());
            System.out.println(wholeNumber + 1);

        } else if (inputVariable.equals("real")) {
            double realNumber = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.2f", realNumber + 1);

        } else if (inputVariable.equals("text")) {
            String inputAsString = scanner.nextLine();
            System.out.println(inputAsString + "*");

        }
    }
}
