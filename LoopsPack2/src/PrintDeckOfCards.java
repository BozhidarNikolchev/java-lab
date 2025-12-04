import java.util.Scanner;

public class PrintDeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String targetFace = scanner.nextLine();

        String[] cardFace = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < cardFace.length; i++) {
            System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds%n", cardFace[i], cardFace[i], cardFace[i], cardFace[i]);

            if (cardFace[i].equals(targetFace)) {
                break;
            }
        }
    }
}
