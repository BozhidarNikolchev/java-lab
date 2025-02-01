import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double thirdNum = Double.parseDouble(scanner.nextLine());

        double calculation = firstNum * secondNum * thirdNum;
        String result = "";

        if (calculation == 0) {
            result = "0";

        } else if (calculation < 0) {
            result = "-";

        } else if (calculation > 0) {
            result = "+";
        }

        System.out.println(result);
    }
}
