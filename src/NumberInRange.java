import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        String result = "";

        if (inputNumber >= -100 && inputNumber < 0) {
            result = "Yes";
        } else if (inputNumber > 0 && inputNumber <= 100) {
            result = "Yes";
        } else {
            result = "No";
        }

        System.out.println(result);
    }
}
