import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kids = 0;
        int adults = 0;
        int toys = 0;
        int sweater = 0;

        while (true) {
            String currentAge = scanner.nextLine();
            if (currentAge.equals("Christmas")) {
                break;
            }
            int toNumber = Integer.parseInt(currentAge);


            if (toNumber <= 16) {
                kids += 1;
                toys += 1;

            } else {
                adults += 1;
                sweater += 1;
            }
        }

        int toysPrice = toys * 5;
        int sweatersPrice = sweater * 15;

        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", toysPrice);
        System.out.printf("Money for sweaters: %d", sweatersPrice);


    }
}
