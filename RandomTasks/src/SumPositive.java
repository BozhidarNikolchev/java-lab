import java.util.Scanner;

public class SumPositive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= inputNumber; i++) {
            result += i;

        }

        System.out.println(result);
    }
}
