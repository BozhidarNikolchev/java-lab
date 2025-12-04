import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine();

        for (int i = 0; i < inputWord.length(); i++) {
            System.out.println(inputWord.charAt(i));
        }
    }
}
