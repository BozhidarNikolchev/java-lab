import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int valueOfLetter = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            switch (letter) {
                case 'a' -> valueOfLetter += 1;
                case 'e' -> valueOfLetter += 2;
                case 'i' -> valueOfLetter += 3;
                case 'o' -> valueOfLetter += 4;
                case 'u' -> valueOfLetter += 5;
            }
        }

        System.out.println(valueOfLetter);

    }
}
