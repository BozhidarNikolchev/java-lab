import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine();
        String longestWord = "";

        while (!inputWord.equals("END")) {

            if (longestWord.length() <= inputWord.length()) {
                longestWord = inputWord;
            }

            inputWord = scanner.nextLine();
        }

        System.out.println(longestWord);


    }
}
