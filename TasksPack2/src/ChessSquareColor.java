import java.util.Scanner;

public class ChessSquareColor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String label = scanner.nextLine();
        int rank = scanner.nextInt();

        String color = "";

        if (label.equals("a") || label.equals("c") || label.equals("e") || label.equals("g")) {

            if (rank % 2 == 0) {
                color = "light";

            } else {
                color = "dark";
            }

        } else if (label.equals("b") || label.equals("d") || label.equals("f") || label.equals("h")) {

            if (rank % 2 == 0) {
                color = "dark";

            } else {
                color = "light";

            }
        }

        System.out.println(color);
    }
}
