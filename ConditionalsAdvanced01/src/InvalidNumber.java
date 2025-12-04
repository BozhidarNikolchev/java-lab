import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number != 0) {
            if (number <= 99 || number > 200) {
                System.out.println("invalid");
            }
        }


    }
}
