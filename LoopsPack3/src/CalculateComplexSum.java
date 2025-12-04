import java.util.Scanner;

public class CalculateComplexSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());

        double sum = 1;
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;

            sum += f / Math.pow(x, i);
        }

        System.out.printf("%.5f", sum);








    }
}