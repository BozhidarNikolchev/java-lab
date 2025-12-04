import java.util.Scanner;

public class inchesToCentimeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double centimeters = Double.parseDouble(scanner.nextLine());

        double convertToInches = centimeters * 2.54;

        System.out.println(convertToInches);

    }
}
