import java.util.Scanner;

public class SmallerGreaterOrEqual {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int first = scanner.nextInt();

        System.out.print(first);

        for (int i = 0; i < n - 1; i++) {
            int next = scanner.nextInt();

            if (next > first) {
                System.out.print("<");

            } else if (next < first) {
                System.out.print(">");

            } else {
                System.out.print("=");

            }

            System.out.print(next);

            first = next;
        }






    }
}