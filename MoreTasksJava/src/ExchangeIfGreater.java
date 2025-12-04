import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangeIfGreater {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        DecimalFormat format = new DecimalFormat("0.#");
        String aToString = format.format(a);
        String bToString = format.format(b);

        if (a > b) {
            System.out.printf("%s %s", bToString, aToString);

        } else {
            System.out.printf("%s %s", aToString, bToString);

        }

    }
}
