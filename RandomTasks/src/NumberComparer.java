import java.util.Scanner;

public class NumberComparer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int checkNumber = Math.max(firstNum, secondNum);

        System.out.println(checkNumber);
    }
}
