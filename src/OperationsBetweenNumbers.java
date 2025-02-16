import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        int result;
        boolean oddOrEven;

        switch (operation) {
            case "-":
                result = n1 - n2;
                oddOrEven = result % 2 == 0;
                if (oddOrEven) {
                    System.out.printf("%d - %d = %d - even", n1, n2, result);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, result);
                }
                break;

            case "+":
                result = n1 + n2;
                oddOrEven = result % 2 == 0;
                if (oddOrEven) {
                    System.out.printf("%d + %d = %d - even", n1, n2, result);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, result);
                }
                break;

            case "*":
                result = n1 * n2;
                oddOrEven = result % 2 == 0;
                if (oddOrEven) {
                    System.out.printf("%d * %d = %d - even", n1, n2, result);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, result);
                }
                break;

            case "/":
                if (n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero");
                } else {
                    double division = (double) n1 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, division);
                }
                break;

            case "%":
                if (n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero");

                } else {
                    int moduleDivision = n1 % n2;
                    System.out.println(n1 + " % " + n2 + " = " + moduleDivision);
                }
                break;
        }

    }
}
