import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine();
        String longestString = "";

        while (!inputWord.equals("END")) {

            if (longestString.length() <= inputWord.length()) {
                longestString = inputWord;
            }

            inputWord = scanner.nextLine();
        }

        System.out.println(longestString);
    }
}