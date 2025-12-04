import java.util.Arrays;
import java.util.Scanner;

public class CheckForPlayCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] cardSigns = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String targetSign = scanner.nextLine();

        boolean isContained = Arrays.asList(cardSigns).contains(targetSign);

        if (isContained) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }

    }
}
